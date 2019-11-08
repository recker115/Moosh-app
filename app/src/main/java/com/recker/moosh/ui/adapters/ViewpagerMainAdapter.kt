package com.recker.moosh.ui.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.view.menu.MenuView
import androidx.recyclerview.widget.RecyclerView
import com.recker.moosh.MooshConstants
import com.recker.moosh.MooshConstants.Companion.HOLDER_FOODITEMS
import com.recker.moosh.MooshConstants.Companion.HOLDER_MENU
import com.recker.moosh.R
import com.recker.moosh.ui.adapters.viewHolders.FoodItemViewHolder
import com.recker.moosh.ui.adapters.viewHolders.MenuViewHolder
import com.recker.moosh.ui.home.fragments.FoodItemFragment
import com.recker.moosh.ui.home.fragments.MenuFragment


/**
 * Created by Santanu 😁 on 2019-11-08.
 */
class ViewpagerMainAdapter : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    /**
     * Its constant because currently the main viewpager has only 2 items
     */
    val _mSize = 2

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return if (viewType == HOLDER_MENU)
            MenuViewHolder(
                LayoutInflater.from(parent.context).inflate(
                    R.layout.menu_holder_layout,
                    parent,
                    false
                )
            )
        else
            FoodItemViewHolder(
                LayoutInflater.from(parent.context).inflate(
                    R.layout.food_item_holder_view,
                    parent,
                    false
                )
            )
    }

    override fun getItemCount(): Int = _mSize

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
    }

    override fun getItemViewType(position: Int): Int {
        return if (position == 0) HOLDER_MENU else HOLDER_FOODITEMS
    }
}