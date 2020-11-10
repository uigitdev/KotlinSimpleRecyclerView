package com.uigitdev.android.kotlin.kotlinsimplerecyclerview.list

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.uigitdev.android.kotlin.kotlinsimplerecyclerview.R

class ListAdapter(private val arrayList: ArrayList<ItemObject>, private val callback: ItemClickListener) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val view: View = LayoutInflater.from(parent.context!!).inflate(R.layout.simple_item, parent, false)
        return ListViewHolder(view)
    }

    override fun getItemCount(): Int {
        return arrayList.size
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        (holder as ListViewHolder).designItem.setTitle(arrayList[position].title)
        (holder).designItem.setSubtitle(arrayList[position].subtitle)
        (holder).designItem.getButton().setOnClickListener { callback.onItemClick(position) }
    }
}