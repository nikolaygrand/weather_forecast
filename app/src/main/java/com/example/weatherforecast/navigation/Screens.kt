package com.example.weatherforecast.navigation

import androidx.fragment.app.Fragment
import com.example.weatherforecast.screens.home.HomeFragment
import ru.terrakok.cicerone.android.support.SupportAppScreen

class Screens {
    class HomeScreen : SupportAppScreen() {
        override fun getFragment(): Fragment {
            return HomeFragment()
        }
    }
/*
    class WeatherDetailsScreen(val cityName: String) : SupportAppScreen() {
        override fun getFragment(): Fragment {
            val bundle = Bundle().apply {
                putLong(HotelFragment.HOTEL_ID, hotelId)
            }

            return HotelFragment().apply {
                arguments = bundle
            }
        }
    }

 */
}