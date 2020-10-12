package com.knight.weather.logic.model

import com.google.gson.annotations.SerializedName

/**
 * <p>描述:</p>
 * <p>版权: Copyright (c) 2020</p>
 * <p>公司: </p>
 *
 * @version: 1.0
 * @Author Knight
 * @FileName: com.knight.weather.logic.model.PlaceResponse.java
 * @date: 2020-10-11 14:49
 */
data class PlaceResponse(val status: String, val places: List<Place>) {

    data class Place(
        val name: String,
        val location: Location,
        @SerializedName("formatted_adress") val adress: String
    )

    data class Location(val lng: String, val lat: String)
}