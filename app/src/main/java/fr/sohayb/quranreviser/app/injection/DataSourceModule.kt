package fr.sohayb.quranreviser.app.injection


import fr.sohayb.quranreviser.app.data.NetworkDataSource
import fr.sohayb.quranreviser.app.data.PreferencesDataSource
import org.koin.dsl.module

val DataSourceModule = module {


/*
    single {
        RoomDataSource()
    }*/


    single {
        PreferencesDataSource(get())
    }


    single {
        NetworkDataSource(get(),get())
    }


}