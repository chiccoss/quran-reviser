package fr.sohayb.quranreviser.base.presentation

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import fr.sohayb.quranreviser.app.domain.AppState
import androidx.lifecycle.observe
import fr.sohayb.quranreviser.app.presentation.AppViewModel
import org.koin.android.ext.android.inject
import org.koin.core.parameter.parametersOf

abstract class BaseActivity: AppCompatActivity() {

    protected val viewModel: AppViewModel by inject { parametersOf(this) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        viewModel.state.observe(this, ::render)
    }

    protected abstract fun render(appState: AppState)
}