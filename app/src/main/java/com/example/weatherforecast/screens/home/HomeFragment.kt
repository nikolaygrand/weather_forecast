package com.example.weatherforecast.screens.home

import com.example.weatherforecast.R
import com.example.weatherforecast.mvp.BaseFragment

class HomeFragment: BaseFragment<HomeView, HomePresenter>(R.layout.fragment_home), HomeView {
    override fun createPresenter(): HomePresenter = HomePresenter()
    override fun addCity(cityName: String) {
        TODO("Not yet implemented")
    }

    override fun deleteCity(cityName: String) {
        TODO("Not yet implemented")
    }

    override fun refresh() {
        TODO("Not yet implemented")
    }

    override fun showCityDetails(cityName: String) {
        TODO("Not yet implemented")
    }
}