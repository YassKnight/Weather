package com.knight.weather

import android.annotation.SuppressLint
import android.app.Application
import android.content.Context

/**
 * <p>描述:</p>
 * <p>版权: Copyright (c) 2020</p>
 * <p>公司: </p>
 *
 * @version: 1.0
 * @Author Knight
 * @FileName: com.knight.weather.WeatherApplication.java
 * @date: 2020-10-11 14:36
 */

class WeatherApplication : Application() {

    companion object {
        const val TOKEN = "wLWhMJSiLZ9FD5PR"

        @SuppressLint("StaticFieldLeak")
        lateinit var context: Context
    }

    override fun onCreate() {
        super.onCreate()
        context = applicationContext
    }
}