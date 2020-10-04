package fr.lpiem.sweettodolist.base.presentation

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import fr.lpiem.sweettodolist.app.domain.AppState
import androidx.lifecycle.observe
import fr.lpiem.sweettodolist.app.presentation.AppViewModel
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