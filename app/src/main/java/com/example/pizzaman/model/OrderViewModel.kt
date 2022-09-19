package com.example.pizzaman.model

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Transformations
import androidx.lifecycle.ViewModel
import java.text.NumberFormat

class OrderViewModel : ViewModel(){
    private val _price = MutableLiveData<Double>()
    val price : LiveData<Double> = _price

    fun setPrice(price: Double){
        _price.value = price
    }
}