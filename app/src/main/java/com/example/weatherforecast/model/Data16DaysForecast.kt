package com.example.weatherforecast.model

class Data16DaysForecast(
    val dt: Long? = null,
    val temp: TemperatureParams,
    val pressure: Float? = null,
    val humidity: Int? = null,
    val weather: List<Weather>,
    val speed: Float? = null,
    val deg: Int? = null,
    val clouds: Int? = null,
    val snow: Float? = null
)

class TemperatureParams(
    val day: Float? = null,
    val min: Float? = null,
    val max: Float? = null,
    val night: Float? = null,
    val eve: Float? = null,
    val morn: Float? = null
)

class Weather(
    val id: Long? = null,
    val main: String?= null,
    val description: String? = null,
    val icon: String? = null
)