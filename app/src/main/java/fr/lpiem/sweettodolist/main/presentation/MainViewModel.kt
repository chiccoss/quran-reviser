package fr.lpiem.sweettodolist.main.presentation

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import fr.lpiem.sweettodolist.app.domain.AppController
import fr.lpiem.sweettodolist.base.presentation.BaseViewModel

class MainViewModel(appController: AppController) : BaseViewModel(appController) {

    class Factory(private val appController: AppController) : ViewModelProvider.Factory {
        @Suppress("UNCHECKED_CAST")
        override fun <T : ViewModel?> create(modelClass: Class<T>): T {
            return MainViewModel(appController) as T
        }
    }
}