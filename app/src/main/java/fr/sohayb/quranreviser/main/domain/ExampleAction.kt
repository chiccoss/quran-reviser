package fr.sohayb.quranreviser.main.domain

import fr.sohayb.quranreviser.base.domain.ActionType
import java.net.URL

sealed class MainAction: ActionType {

    data class DownloadWebpage(var url: URL): MainAction()
}