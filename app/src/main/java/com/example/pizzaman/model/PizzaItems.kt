package com.example.pizzaman.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class PizzaItems(
    @StringRes val stringResourceId: Int,
    @DrawableRes val imageResourceID: Int
) {
}