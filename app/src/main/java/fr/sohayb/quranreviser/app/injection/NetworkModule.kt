package fr.sohayb.quranreviser.app.injection

import com.google.gson.Gson
import com.google.gson.GsonBuilder
import com.jakewharton.retrofit2.converter.kotlinx.serialization.asConverterFactory
import fr.sohayb.quranreviser.app.api.NetworkService
import fr.sohayb.quranreviser.app.api.TLSSocketFactory
import fr.sohayb.quranreviser.app.error.ErrorInterceptor
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonConfiguration
import okhttp3.MediaType.Companion.toMediaType
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import org.koin.dsl.module
import retrofit2.Retrofit
import timber.log.Timber
import java.security.KeyManagementException
import java.security.KeyStoreException
import java.security.NoSuchAlgorithmException
import javax.net.ssl.X509TrustManager


val NetworkModule = module {

    single {
        HttpLoggingInterceptor(object : HttpLoggingInterceptor.Logger {
            override fun log(message: String) {
                Timber.tag("OkHttp").d(message)
            }
        }).apply { level = HttpLoggingInterceptor.Level.BODY }
    }

    single<Gson> {
        GsonBuilder().setLenient().setDateFormat("yyyy-MM-dd'T'HH:mm:ssZZZZZ").create()
    }

    single {
        ErrorInterceptor(get())
    }


    single {
        TLSSocketFactory()
    }

    single {
        val tlsSocketFactory = TLSSocketFactory()

        tlsSocketFactory.getTrustManager()
    }




    single {


            OkHttpClient.Builder()
                .addInterceptor(get<HttpLoggingInterceptor>())
                .addInterceptor(get<ErrorInterceptor>())
                //.sslSocketFactory(get(),get())
                .build()
            //.connectionSpecs(Collections.singletonList(spec))

    }

    single<Retrofit> {

        val url = "http://api.quran-tafseer.com/"
        Retrofit.Builder()
            .client(get())
            .baseUrl(url)
            .addConverterFactory(
                Json(
                    JsonConfiguration(
                        ignoreUnknownKeys = true,
                        isLenient = true
                    )
                ).asConverterFactory("application/json".toMediaType())
            )
            .build()
    }

    single<NetworkService> {
        val retrofit = get<Retrofit>()
        retrofit.create(NetworkService::class.java)
    }

}
