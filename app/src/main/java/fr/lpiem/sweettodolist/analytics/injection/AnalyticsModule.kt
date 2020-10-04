package fr.lpiem.sweettodolist.analytics.injection

import fr.lpiem.sweettodolist.analytics.domain.AnalyticsProcessor
import org.koin.dsl.module

val AnalyticsModule = module {

    single { AnalyticsProcessor() }

}