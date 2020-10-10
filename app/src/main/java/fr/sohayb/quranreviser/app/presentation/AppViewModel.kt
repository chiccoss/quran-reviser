package fr.sohayb.quranreviser.app.presentation

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import fr.sohayb.quranreviser.app.domain.AppController
import fr.sohayb.quranreviser.base.presentation.BaseViewModel

class AppViewModel(appController: AppController) : BaseViewModel(appController) {

    class Factory(private val appController: AppController) : ViewModelProvider.Factory {
        @Suppress("UNCHECKED_CAST")
        override fun <T : ViewModel?> create(modelClass: Class<T>): T {
            return AppViewModel(appController) as T
        }
    }
}