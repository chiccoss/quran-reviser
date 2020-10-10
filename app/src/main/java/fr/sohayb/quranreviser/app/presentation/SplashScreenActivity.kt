package fr.sohayb.quranreviser.app.presentation

import android.annotation.SuppressLint
import android.os.Bundle
import fr.sohayb.quranreviser.R
import fr.sohayb.quranreviser.app.domain.AppState
import fr.sohayb.quranreviser.base.presentation.BaseActivity
import fr.sohayb.quranreviser.main.domain.QuranAction

class SplashScreenActivity : BaseActivity() {

    @SuppressLint("ClickableViewAccessibility")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)
        viewModel.dispatch(QuranAction.InitApplication)
    }

    override fun render(appState: AppState) {
        if(appState.quranState.goToMainActivity.consume()){
            MainActivity.start(this)
            finish()
        }
    }
}