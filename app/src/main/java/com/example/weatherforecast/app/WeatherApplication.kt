package com.example.weatherforecast.app

import android.app.Application
import ru.antonov.hotels.di.AppComponent
import ru.antonov.hotels.di.DaggerAppComponent

class WeatherApplication: Application() {
    override fun onCreate() {
        super.onCreate()
        appComponent = DaggerAppComponent.create()
    }

    companion object {
        const val TAG = "WeatherApplication"
        lateinit var appComponent: AppComponent
    }
}