package fr.sohayb.quranreviser.main.presentation

import android.app.Activity
import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.core.content.ContextCompat
import fr.sohayb.quranreviser.R
import fr.sohayb.quranreviser.app.domain.AppState
import fr.sohayb.quranreviser.base.presentation.BaseActivity
import fr.sohayb.quranreviser.main.data.Sura
import fr.sohayb.quranreviser.main.domain.QuranAction

class AyahTafseerActivity : BaseActivity() {

   // val sequenceAdapter = SuraAdapter(::onClickResultEvent, ::onLongClickResultEvent)
    val fromKeyIntent = "comingFrom"

    companion object {
        fun start(context: Context,activity: Activity,from : Int? = null,surat : Sura) {
            val intent = Intent(context, AyahTafseerActivity::class.java)
            intent.putExtra("comingFrom",from)
            intent.putExtra("sura",surat)
            //activity.startActivityForResult(intent,from)
            ContextCompat.startActivity(context, intent, null)
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ayah_tafseer)
        viewModel.dispatch(QuranAction.GetCurrentTafseer)


    }

    override fun render(appState: AppState) {
        appState.quranState.currentTafseer?.let { currentTafseer ->
            appState.quranState.currentAyah?.let {
                //viewModel.dispatch(QuranAction.GetAyahTafseer(currentTafseerId,current))
            }
        }
    }

    override fun onBackPressed() {
        super.onBackPressed()
        finish()
       /* when(intent.extras?.get(fromKeyIntent)){
            FROM_TEST_FRAGMENT -> setResult(FROM_TEST_FRAGMENT)
            FROM_TAFSEER_FRAGMENT -> setResult(FROM_TAFSEER_FRAGMENT)
        }*/
    }

    private fun onClickResultEvent(sura: Sura) {
        //viewModel.dispatch(QuranAction.GetAyahTafseer(1, sura.id, 1))
    }

    private fun onLongClickResultEvent(sura: Sura) {

    }

}