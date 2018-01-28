package com.tubandev.coderswag.adapters

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.tubandev.coderswag.R
import com.tubandev.coderswag.model.Product
import kotlinx.android.synthetic.main.product_list_item.view.*

/**
 * Created by sulistiyanto on 28/01/18.
 */
class ProductsAdapter(val context : Context, val products : List<Product>)
    : RecyclerView.Adapter<ProductsAdapter.ProductHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): ProductHolder {
        val view = LayoutInflater.from(parent?.context)
                .inflate(R.layout.product_list_item, parent, false)
        return ProductHolder(view)
    }

    override fun getItemCount(): Int {
        return products.count()
    }

    override fun onBindViewHolder(holder: ProductHolder?, position: Int) {
        holder?.bindProduct(products[position], context)
    }

    class ProductHolder(itemView: View?) : RecyclerView.ViewHolder(itemView) {
        fun bindProduct(product: Product, context: Context) {
            itemView.productName?.text = product.title
            itemView.productPrice?.text = product.price
            val resourceId = context.resources.getIdentifier(product.image,
                    "drawable", context.packageName)
            itemView.productImage?.setImageResource(resourceId)
        }
    }
}