package com.example.pizzaman.data

import com.example.pizzaman.R
import com.example.pizzaman.model.PizzaItems

class DataSource() {
    fun loadPizzaList(): List<PizzaItems> {
        return listOf(
            PizzaItems(R.string.pizza1, R.drawable.image1),
            PizzaItems(R.string.pizza2, R.drawable.image2),
            PizzaItems(R.string.pizza3, R.drawable.image3),
            PizzaItems(R.string.pizza4, R.drawable.image4),
            PizzaItems(R.string.pizza5, R.drawable.image5),
            PizzaItems(R.string.pizza6, R.drawable.image6),
            PizzaItems(R.string.pizza7, R.drawable.image7),
            PizzaItems(R.string.pizza8, R.drawable.image8),
            PizzaItems(R.string.pizza9, R.drawable.image9),
            PizzaItems(R.string.pizza10, R.drawable.image10)
        )
    }
}