package fr.sohayb.quranreviser.app.data

import fr.sohayb.quranreviser.main.data.Tafseer

data class CurrentTafseerPreferences(
    val id: Int,
    val name: String,
    val language: String,
    val author: String,
    val book_name: String
){
    fun toTafseer() : Tafseer{
        return Tafseer(
            id,
            name,
            language,
            author,
            book_name
        )
    }
}