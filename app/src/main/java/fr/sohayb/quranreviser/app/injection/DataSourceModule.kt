package fr.sohayb.quranreviser.app.injection


import fr.sohayb.quranreviser.app.database.RoomDataSource
import org.koin.dsl.module

val DataSourceModule = module {



    single {
        RoomDataSource()
    }


}