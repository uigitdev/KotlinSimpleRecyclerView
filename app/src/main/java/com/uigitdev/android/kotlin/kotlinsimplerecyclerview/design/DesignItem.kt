package com.uigitdev.android.kotlin.kotlinsimplerecyclerview.design

import android.view.View
import android.widget.RelativeLayout
import android.widget.TextView
import androidx.cardview.widget.CardView
import com.uigitdev.android.kotlin.kotlinsimplerecyclerview.R

class DesignItem(var view: View) {
    private lateinit var item_card_parent: CardView
    private lateinit var item_click_parent: RelativeLayout
    private lateinit var item_title: TextView
    private lateinit var item_subtitle: TextView

    init {
        setType()
    }

    private fun setType() {
        item_card_parent = view.findViewById(R.id.item_card_parent)
        item_click_parent = view.findViewById(R.id.item_click_parent)
        item_title = view.findViewById(R.id.item_title)
        item_subtitle = view.findViewById(R.id.item_subtitle)
    }

    fun setTitle(text: String) {
        item_title.text = text
    }

    fun setSubtitle(text: String) {
        item_subtitle.text = text
    }

    fun getButton(): RelativeLayout {
        return item_click_parent
    }
}