package com.knight.weather.logic.network

import com.knight.weather.WeatherApplication
import com.knight.weather.logic.model.PlaceResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

/**
 * <p>描述:</p>
 * <p>版权: Copyright (c) 2020</p>
 * <p>公司: </p>
 *
 * @version: 1.0
 * @Author Knight
 * @FileName: com.knight.weather.logic.network.PlaceService.java
 * @date: 2020-10-11 14:52
 */
interface PlaceService {
    @GET("v2/place?token=${WeatherApplication.TOKEN}&lang=zh_CN")
    fun searchPlaces(@Query("query") query: String): Call<PlaceResponse>
}