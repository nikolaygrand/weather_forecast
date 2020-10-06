package com.example.weatherforecast.activities

import com.example.weatherforecast.app.WeatherApplication
import com.example.weatherforecast.mvp.BasePresenter
import com.example.weatherforecast.navigation.Screens
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.rxkotlin.plusAssign
import ru.terrakok.cicerone.Router
import javax.inject.Inject

class MainPresenter : BasePresenter<MainView>() {

    @Inject
    lateinit var router: Router

    override fun attachView(view: MainView) {
        super.attachView(view)
        WeatherApplication.appComponent.inject(this)

        disposable += view.back()
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe({
                router.exit()
            }, {})

        router.newRootScreen(Screens.HomeScreen())

    }
}