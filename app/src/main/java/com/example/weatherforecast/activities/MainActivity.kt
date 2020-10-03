package com.example.weatherforecast.activities

import android.os.Bundle
import com.example.weatherforecast.R
import com.hannesdorfmann.mosby3.mvp.MvpActivity
import io.reactivex.subjects.PublishSubject

class MainActivity : MvpActivity<MainView, MainPresenter>(), MainView {
    private val subjectBack = PublishSubject.create<Unit>()

    override fun createPresenter(): MainPresenter = MainPresenter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun back() = subjectBack
}