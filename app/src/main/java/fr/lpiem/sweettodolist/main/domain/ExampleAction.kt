package fr.lpiem.sweettodolist.main.domain

import fr.lpiem.sweettodolist.base.domain.ActionType
import java.net.URL

sealed class MainAction: ActionType {

    data class DownloadWebpage(var url: URL): MainAction()
}