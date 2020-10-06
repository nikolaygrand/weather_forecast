package com.example.weatherforecast.navigation

import android.widget.Toast
import androidx.fragment.app.FragmentActivity
import com.example.weatherforecast.app.WeatherApplication
import io.reactivex.subjects.PublishSubject
import ru.terrakok.cicerone.android.support.SupportAppNavigator
import java.util.concurrent.TimeUnit
import kotlin.system.exitProcess

class Navigator (private val activity: FragmentActivity, containerId: Int) : SupportAppNavigator(activity, containerId) {

    private val exitClicks = PublishSubject.create<Unit>()
    val exitDispose = exitClicks
        .doOnNext { showSystemMessage("Нажмите ещё раз, чтобы выйти") }
        .buffer(2000, 0, TimeUnit.MILLISECONDS)
        .filter{ it.size > 1}
        .subscribe {
            exitProcess(0)
        }

    init {
        WeatherApplication.appComponent.inject(this)
    }

    fun exit() {
        exitClicks.onNext(Unit)
    }

    private fun showSystemMessage(message: String?) {
        Toast.makeText(activity, message, Toast.LENGTH_LONG).show()
    }

}