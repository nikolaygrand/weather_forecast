package ru.antonov.hotels.di

import androidx.annotation.NonNull
import com.example.weatherforecast.network.WeatherApi
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class NetworkModule {
    @Singleton
    @NonNull
    @Provides
    fun apiClient() = WeatherApi()
}