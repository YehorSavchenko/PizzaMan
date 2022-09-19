package com.example.pizzaman.adapter

import android.content.Context
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.pizzaman.R
import com.example.pizzaman.model.OrderViewModel
import com.example.pizzaman.model.PizzaItems

class PizzaItemAdapter(
    private val context: Context,
    private val dataset: List<PizzaItems>,
    private val viewModel: OrderViewModel
) : RecyclerView.Adapter<PizzaItemAdapter.ItemViewHolder>() {
    // Provide a reference to the views for each data item
    // Complex data items may need more than one view per item, and
    // you provide access to all the views for a data item in a view holder.
    // Each data item is just an Affirmation object.
    class ItemViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val nameTextView: TextView = view.findViewById(R.id.item_title)
        val priceTextView: TextView = view.findViewById(R.id.item_price)
        val imageView: ImageView = view.findViewById(R.id.item_image)
    }

    /**
     * Create new views (invoked by the layout manager)
     */
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        //create a new view
        val adapterLayout =
            LayoutInflater.from(parent.context).inflate(R.layout.pizza_item, parent, false)

        return ItemViewHolder(adapterLayout)
    }

    /**
     * Replace the contents of a view (invoked by the layout manager)
     */
    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val item = dataset[position]
        holder.nameTextView.text = context.resources.getString(item.stringResourceId)
//        Log.d("PizzaItemAdapter", "Price: ${viewModel.price.value}")
        holder.priceTextView.text =
            context.resources.getString(R.string.price, viewModel.price.value)
        holder.imageView.setImageResource(item.imageResourceID)
    }

    /**
     * Return the size of your dataset (invoked by the layout manager)
     */
    override fun getItemCount(): Int {
        return dataset.size
    }
}