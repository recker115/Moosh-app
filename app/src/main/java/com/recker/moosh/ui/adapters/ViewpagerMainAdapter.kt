package com.recker.moosh.ui.adapters

import android.view.View
import com.recker.moosh.R
import com.recker.moosh.ui.adapters.viewHolders.FoodItemViewHolder
import com.recker.moosh.ui.adapters.viewHolders.MenuViewHolder
import com.recker.moosh.ui.base.BaseViewHolder


/**
 * Created by Santanu 😁 on 2019-11-08.
 */
class ViewpagerMainAdapter : BaseRecyclerViewAdapter<BaseViewHolder>() {
    override fun getViewHolder(itemView: View, viewType: Int): BaseViewHolder =
        if (viewType == R.layout.food_item_holder_view) FoodItemViewHolder(itemView) else MenuViewHolder(
            itemView
        )

    override fun getLength(): Int = _mSize

    override fun getModel(position: Int): Any = _mSize

    /**
     * Its constant because currently the main viewpager has only 2 items
     */
    val _mSize = 2

    override fun getItemViewType(position: Int): Int =
        if (position == 0) R.layout.menu_holder_layout else R.layout.food_item_holder_view

}