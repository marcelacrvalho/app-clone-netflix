package com.example.netflix.main.activities

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.netflix.R
import com.example.netflix.utils.models.Category

class CategoryAdapter(private val categories: List<Category>): RecyclerView.Adapter<CategoryAdapter.CategoryViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CategoryViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.category_item, parent, false)
        return CategoryViewHolder(view)
    }

    override fun getItemCount(): Int {
        return categories.size
    }

    override fun onBindViewHolder(holder: CategoryViewHolder, position: Int) {
       val currentCategory = categories[position]
        holder.bind(currentCategory)
    }
    inner class CategoryViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(category: Category) {
            val tvCategory: TextView = itemView.findViewById(R.id.tv_title)
            tvCategory.text = category.title

            val rvCategory: RecyclerView = itemView.findViewById(R.id.rv_category)
            rvCategory.
        }
    }
}
