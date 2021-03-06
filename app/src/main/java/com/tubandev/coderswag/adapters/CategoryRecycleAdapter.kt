package com.tubandev.coderswag.adapters

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.tubandev.coderswag.R
import com.tubandev.coderswag.model.Category
import kotlinx.android.synthetic.main.category_list_item.view.*

/**
 * Created by sulistiyanto on 28/01/18.
 */
class CategoryRecycleAdapter(val context: Context, val categories: List<Category>, val itemClick : (Category) -> Unit)
    : RecyclerView.Adapter<CategoryRecycleAdapter.Holder>() {

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): Holder {
        val view = LayoutInflater.from(parent?.context)
                .inflate(R.layout.category_list_item, parent, false)
        return Holder(view, itemClick)
    }

    override fun getItemCount(): Int {
        return categories.count()
    }

    override fun onBindViewHolder(holder: Holder?, position: Int) {
        holder?.bindCategory(categories[position], context)
    }

    class Holder(itemView: View?, private val itemClick: (Category) -> Unit) : RecyclerView.ViewHolder(itemView) {

        fun bindCategory(category: Category, context: Context) {
            val resourceId = context.resources.getIdentifier(category.image,
                    "drawable", context.packageName)
            itemView.categoryImage.setImageResource(resourceId)
            itemView.categoryName.text = category.title
            itemView.setOnClickListener { itemClick(category) }
        }

    }

}