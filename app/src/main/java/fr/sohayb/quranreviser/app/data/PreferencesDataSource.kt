package fr.sohayb.quranreviser.app.data

import android.content.Context
import android.content.SharedPreferences
import com.google.gson.GsonBuilder
import fr.sohayb.quranreviser.app.data.SavedFilterPreferences
import fr.sohayb.quranreviser.R

class PreferencesDataSource(private val context: Context) {

    private val preferences: SharedPreferences =
        context.getSharedPreferences("SharedPreferences", Context.MODE_PRIVATE)

    private val tagConnectedKeys = "ConnectedKeys"
    private val tagTokenExpiration = "TokenExpiration"
    private val tagTutorialAlreadySeen = "TutorialAlreadySeen"
    private val tagNeedAddCar = "NeedAddCar"
    private val tagSubscriptionFilter = "SubscriptionFilter"
    private val tagSavedFilter = "SavedFilter"

    //region Authorization

    var tokenJwt: String?
        get() {
            return preferences.getString(tagConnectedKeys, null)
        }
        set(value) {
            preferences.edit()
                .putString(tagConnectedKeys, value)
                .apply()
        }


   /* fun getBearerToken(): String? {
        return tokenJwt?.let { context.getString(R.string.ws_token, it) }
    }*/

    var tokenExpiration: Long
        get() {
            return preferences.getLong(tagTokenExpiration, -1L)
        }
        set(value) {
            preferences.edit()
                .putLong(tagTokenExpiration, value)
                .apply()
        }

    fun tokenHasExpired(): Boolean {
        return if(tokenExpiration == -1L) false else tokenExpiration <= System.currentTimeMillis()
    }

    //endregion

    //region Tutorial

    var tutorialAlreadySeen: Boolean
        get() {
            return preferences.getBoolean(tagTutorialAlreadySeen, false)
        }
        set(value) {
            preferences.edit()
                .putBoolean(tagTutorialAlreadySeen, value)
                .apply()
        }

    //endregion

    //region Add Car

    var needAddCar: Boolean
        get() {
            return preferences.getBoolean(tagNeedAddCar, true)
        }
        set(value) {
            preferences.edit()
                .putBoolean(tagNeedAddCar, value)
                .apply()
        }

    //endregion

    //region Filter

    var savedFilter: SavedFilterPreferences?
        get() {
            return getObject<SavedFilterPreferences>(tagSavedFilter)
        }
        set(value) {
            putObject(value, tagSavedFilter)
        }

    fun saveFilter(savedFilter: SavedFilterPreferences): Boolean {
        return putObject(savedFilter, tagSavedFilter)
    }

    //endregion

    private fun <T> putObject(`object`: T, key: String): Boolean {
        //Convert object to JSON String.
        val jsonString = GsonBuilder().create().toJson(`object`)
        //Save that String in SharedPreferences
        return preferences.edit().putString(key, jsonString).commit()
    }

    private inline fun <reified T> getObject(key: String): T? {
        //We read JSON String which was saved.
        val value = preferences.getString(key, null)
        //JSON String was found which means object can be read.
        //We convert this JSON String to model object. Parameter "c" (of
        //type Class < T >" is used to cast.
        return GsonBuilder().create().fromJson(value, T::class.java)
    }

    fun cleanData(){
        tokenJwt = null
        tokenExpiration = -1L
        savedFilter = null
    }

}