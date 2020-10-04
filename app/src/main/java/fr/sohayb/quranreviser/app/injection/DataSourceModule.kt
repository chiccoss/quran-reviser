package fr.sohayb.quranreviser.app.injection


import fr.sohayb.quranreviser.app.data.NetworkDataSource
import fr.sohayb.quranreviser.app.database.RoomDataSource
import org.koin.dsl.module

val DataSourceModule = module {



    single {
        RoomDataSource()
    }

    single {
        NetworkDataSource(get(),get())
    }


}