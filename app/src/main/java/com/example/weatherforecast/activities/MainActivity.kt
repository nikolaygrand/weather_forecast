package com.example.weatherforecast.activities

import android.os.Bundle
import com.example.weatherforecast.R
import com.example.weatherforecast.app.WeatherApplication
import com.example.weatherforecast.navigation.Navigator
import com.hannesdorfmann.mosby3.mvp.MvpActivity
import io.reactivex.subjects.PublishSubject
import ru.terrakok.cicerone.NavigatorHolder

import javax.inject.Inject

class MainActivity : MvpActivity<MainView, MainPresenter>(), MainView {
    private val subjectBack = PublishSubject.create<Unit>()

    @Inject
    lateinit var navigatorHolder: NavigatorHolder

    private val navigator = Navigator(this, R.id.fragment_main_layout)

    override fun createPresenter(): MainPresenter = MainPresenter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        WeatherApplication.appComponent.inject(this)

    }

    override fun onResume() {
        super.onResume()
        navigatorHolder.setNavigator(navigator)
    }

    override fun onPause() {
        navigatorHolder.removeNavigator()
        super.onPause()
    }

    override fun back() = subjectBack
}