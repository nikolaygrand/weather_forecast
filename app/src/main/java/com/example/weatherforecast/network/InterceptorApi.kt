package com.example.weatherforecast.network

import com.example.weatherforecast.BuildConfig
import okhttp3.Interceptor
import okhttp3.Response

class InterceptorApi : Interceptor {
    override fun intercept(chain: Interceptor.Chain): Response {
        val original = chain.request()
        val request = original.newBuilder()
            .url(original.url)
            .addHeader("appid", BuildConfig.API_KEY)
            .method(original.method, original.body)
            .build()
        return chain.proceed(request)
    }
}