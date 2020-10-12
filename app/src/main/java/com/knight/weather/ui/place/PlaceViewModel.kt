package com.knight.weather.ui.place

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Transformations
import androidx.lifecycle.ViewModel
import com.knight.weather.logic.Repository
import com.knight.weather.logic.model.PlaceResponse

/**
 * <p>描述:</p>
 * <p>版权: Copyright (c) 2020</p>
 * <p>公司: </p>
 *
 * @version: 1.0
 * @Author Knight
 * @FileName: com.knight.weather.ui.place.PlaceViewModel.java
 * @date: 2020-10-11 16:08
 */
class PlaceViewModel : ViewModel() {
    private val searchLiveData = MutableLiveData<String>()

    val placeList = ArrayList<PlaceResponse.Place>()

    val placeLiveData = Transformations.switchMap(searchLiveData) { query ->
        Repository.seatchPlaces(query)
    }

    fun searchPlaces(query: String) {
        searchLiveData.value = query
    }
}