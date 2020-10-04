package fr.sohayb.quranreviser.app.presentation

import android.os.Bundle
import android.widget.Toast
import fr.sohayb.quranreviser.R
import fr.sohayb.quranreviser.app.domain.AppState
import fr.sohayb.quranreviser.base.presentation.BaseActivity
import fr.sohayb.quranreviser.main.domain.QuranAction

class MainActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //viewModel.dispatch(QuranAction.GetAyahTafseer(1, 2, 2))
    }

    override fun render(appState: AppState) {
        appState.quranState.currentAyah?.let {
            Toast.makeText(this,it.ayahText,Toast.LENGTH_LONG).show()
        }
    }
}
