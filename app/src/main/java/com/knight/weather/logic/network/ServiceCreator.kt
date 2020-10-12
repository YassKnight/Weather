package com.knight.weather.logic.network

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

/**
 * <p>描述:</p>
 * <p>版权: Copyright (c) 2020</p>
 * <p>公司: </p>
 *
 * @version: 1.0
 * @Author Knight
 * @FileName: com.knight.weather.logic.network.ServiceCreator.java
 * @date: 2020-10-11 14:57
 */
object ServiceCreator {
    private const val BASE_URL = "https://api.caiyunapp.com/"
    private val retrofit =
        Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()

    fun <T> create(serviceClass: Class<T>): T = retrofit.create(serviceClass)
    inline fun <reified T> create(): T = create(T::class.java)
}
