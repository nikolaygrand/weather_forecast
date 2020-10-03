package com.example.weatherforecast.screens.home

import com.hannesdorfmann.mosby3.mvp.MvpView

interface HomeView: MvpView {
    fun addCity(cityName: String)
    fun deleteCity(cityName: String)
    fun refresh()
    fun showCityDetails(cityName: String)
}