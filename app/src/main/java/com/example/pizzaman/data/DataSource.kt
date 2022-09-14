package com.example.pizzaman.data

import com.example.pizzaman.R
import com.example.pizzaman.model.PizzaItems

class DataSource() {
    fun loadPizzaList(): List<PizzaItems> {
        return listOf<PizzaItems>(
            PizzaItems(R.string.affirmation1, R.drawable.image1),
            PizzaItems(R.string.affirmation2, R.drawable.image2),
            PizzaItems(R.string.affirmation3, R.drawable.image3),
            PizzaItems(R.string.affirmation4, R.drawable.image4),
            PizzaItems(R.string.affirmation5, R.drawable.image5),
            PizzaItems(R.string.affirmation6, R.drawable.image6),
            PizzaItems(R.string.affirmation7, R.drawable.image7),
            PizzaItems(R.string.affirmation8, R.drawable.image8),
            PizzaItems(R.string.affirmation9, R.drawable.image9),
            PizzaItems(R.string.affirmation10, R.drawable.image10)
        )
    }
}