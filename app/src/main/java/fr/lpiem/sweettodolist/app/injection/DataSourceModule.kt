package fr.lpiem.sweettodolist.app.injection


import fr.lpiem.sweettodolist.app.database.RoomDataSource
import org.koin.dsl.module

val DataSourceModule = module {



    single {
        RoomDataSource()
    }


}