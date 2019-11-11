package com.recker.moosh.ui.base

import android.view.View
import androidx.recyclerview.widget.RecyclerView


/**
 * Created by Santanu 😁 on 2019-11-11.
 */
abstract class BaseViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    // class extending the BaseViewHolder should return the R.layout.bla_bla_bla ( to be inflated )
    abstract fun getLayoutResource(): Int

    // Used to bind the data to item
    abstract fun <T> bind(model: T)
}