package com.uigitdev.android.kotlin.kotlinsimplerecyclerview.list

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.uigitdev.android.kotlin.kotlinsimplerecyclerview.design.DesignItem

class ListViewHolder(view: View): RecyclerView.ViewHolder(view) {
    val designItem: DesignItem = DesignItem(view)
}