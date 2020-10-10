package fr.sohayb.quranreviser.analytics.injection

import fr.sohayb.quranreviser.analytics.domain.AnalyticsProcessor
import org.koin.dsl.module

val AnalyticsModule = module {

    single { AnalyticsProcessor() }

}