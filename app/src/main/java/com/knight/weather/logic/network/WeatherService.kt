package com.knight.weather.logic.network

import com.knight.weather.WeatherApplication
import com.knight.weather.logic.model.DailyResponse
import com.knight.weather.logic.model.PlaceResponse
import com.knight.weather.logic.model.RealtimeResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

/**
 * <p>描述:</p>
 * <p>版权: Copyright (c) 2020</p>
 * <p>公司: </p>
 *
 * @version: 1.0
 * @Author Knight
 * @FileName: com.knight.weather.logic.network.WeatherService.java
 * @date: 2020-10-11 17:33
 */
interface WeatherService {
    @GET("v2.5/${WeatherApplication.TOKEN}/{lng},{lat}/realtime.json")
    fun getRealtimeWeather(
        @Path("lng") lng: String,
        @Path("lat") lat: String
    ): Call<RealtimeResponse>

    @GET("v2.5/${WeatherApplication.TOKEN}/{lng},{lat}/daily.json")
    fun getDailyWeather(
        @Path("lng") lng: String,
        @Path("lat") lat: String
    ): Call<DailyResponse>
}