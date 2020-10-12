package com.knight.weather.logic.model

/**
 * <p>描述:</p>
 * <p>版权: Copyright (c) 2020</p>
 * <p>公司: </p>
 *
 * @version: 1.0
 * @Author Knight
 * @FileName: com.knight.weather.logic.model.Weather.java
 * @date: 2020-10-11 17:31
 */
data class Weather(val realtime: RealtimeResponse.Realtime, val daily: DailyResponse.Daily)