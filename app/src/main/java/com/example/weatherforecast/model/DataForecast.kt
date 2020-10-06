package com.example.weatherforecast.model

import com.google.gson.annotations.SerializedName

class DataForecast(
    val cod: Int? = null,
    val message: Int? = null,
    val city: DataCity,
    val cnt: Long? = 0,
    val list: List<Data16DaysForecast>
)

class DataCity(
    @SerializedName("geoname_id")
    val geonameId: Long? = null,
    val name: String? = null,
    val lat: Double? = null,
    val lon: Double? = null,
    val country: String? = null,
    val iso2: String? = null,
    val type: String? = null,
    val population: Long? = null
)