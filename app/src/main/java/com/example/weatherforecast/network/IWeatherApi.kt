package com.example.weatherforecast.network

import com.example.weatherforecast.model.Data16DaysForecast
import io.reactivex.Single
import retrofit2.http.GET
import retrofit2.http.Query

interface IWeatherApi {
    @GET("/daily")
    fun getDaily16Forecast(
        @Query("q") cityName: String,
        @Query("cnt") days: Int = 16,
        @Query("units") units: String = UnitsEnum.METRIC.units,
        @Query("lang") lang: String = "ru"): Single<Data16DaysForecast>
}