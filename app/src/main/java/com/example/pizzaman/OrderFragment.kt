package com.example.pizzaman

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.recyclerview.widget.RecyclerView
import com.example.pizzaman.adapter.PizzaItemAdapter
import com.example.pizzaman.data.DataSource
import com.example.pizzaman.model.OrderViewModel

class OrderFragment : Fragment() {
    private val sharedViewModel: OrderViewModel by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_order, container, false)

        // Initialize data.
        val pizzaDataset = DataSource()
        sharedViewModel.setPrice(pizzaDataset.pricePerPizza)

        val recycleView = view.findViewById<RecyclerView>(R.id.recycler_view)
        recycleView.adapter =
            PizzaItemAdapter(inflater.context, pizzaDataset.loadPizzaList(),sharedViewModel)
        recycleView.setHasFixedSize(true)

        return view
    }
}