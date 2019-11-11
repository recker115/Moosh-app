package com.recker.moosh.ui.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.recker.moosh.ui.base.BaseViewHolder


/**
 * Created by Santanu 😁 on 2019-11-11.
 */
abstract class BaseRecyclerViewAdapter<T : BaseViewHolder> : RecyclerView.Adapter<BaseViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): T {
        return getViewHolder(LayoutInflater.from(parent.context).inflate(viewType, parent, false), viewType)
    }

    override fun getItemCount(): Int = getLength()

    override fun onBindViewHolder(holder: BaseViewHolder, position: Int) = holder.bind(getModel(position))

    /**
     * Should implement this method to return an object of the viewholder
     * @param itemView
     */
    abstract fun getViewHolder(
        itemView: View,
        viewType: Int
    ): T

    /**
     * This is the size of the recyclerView
     */
    abstract fun getLength(): Int

    /**
     * This is the item of the recyclerView
     * @param position
     */
    abstract fun getModel(position: Int): Any
}