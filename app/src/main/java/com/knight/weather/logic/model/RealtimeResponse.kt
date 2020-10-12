package com.knight.weather.logic.model

import com.google.gson.annotations.SerializedName

/**
 * <p>描述:单天天气数据模型</p>
 * <p>版权: Copyright (c) 2020</p>
 * <p>公司: </p>
 *
 * @version: 1.0
 * @Author Knight
 * @FileName: com.knight.weather.logic.model.RealtimeResponse.java
 * @date: 2020-10-11 17:16
 */

data class RealtimeResponse(val status: String, val result: Result) {

    data class Result(val realtime: Realtime)
    data class Realtime(
        val skycon: String,
        val temperature: Float,
        @SerializedName("air_quality") val airQuality: AirQuality
    )

    data class AirQuality(val aqi: AQI)
    data class AQI(val chn: Float)
}