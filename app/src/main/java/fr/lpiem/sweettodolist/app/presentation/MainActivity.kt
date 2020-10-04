package fr.lpiem.sweettodolist.app.presentation

import android.os.Bundle
import fr.lpiem.sweettodolist.R
import fr.lpiem.sweettodolist.app.domain.AppState
import fr.lpiem.sweettodolist.base.presentation.BaseActivity

class MainActivity: BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    override fun render(appState: AppState) {

    }
}
