package com.recker.moosh.ui.home

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.core.view.ViewCompat
import androidx.recyclerview.widget.RecyclerView
import androidx.viewpager2.widget.ViewPager2
import androidx.viewpager2.widget.ViewPager2.ORIENTATION_HORIZONTAL
import com.recker.moosh.R
import com.recker.moosh.ui.adapters.ViewpagerMainAdapter
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.math.abs

/**
 *  Created by Santanu 😁 since november 2019
 */
class HomeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initViewPager2()
    }

    /**
     * This sets up the home screen main viewpager with shared app name and all
     */
    private fun initViewPager2() {
        with(vpHome) {
            clipToPadding = false
            clipChildren = false
            offscreenPageLimit = 3
        }

        vpHome.adapter = ViewpagerMainAdapter()
        vpHome.orientation = ViewPager2.ORIENTATION_VERTICAL
    }

}
