package ru.antonov.hotels.di

import com.example.weatherforecast.activities.MainActivity
import com.example.weatherforecast.activities.MainPresenter
import com.example.weatherforecast.app.WeatherApplication
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(
    modules = [
        AppModule::class,
        NetworkModule::class,
        NavigationModule::class,
        RepositoryModule::class,
        InteractorModule::class
    ]
)
interface AppComponent {
    fun inject(application: WeatherApplication)
    fun inject(activity: MainActivity)
    fun inject(presenter: MainPresenter)
}