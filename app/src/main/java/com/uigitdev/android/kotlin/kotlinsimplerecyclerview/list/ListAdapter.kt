package com.uigitdev.android.kotlin.kotlinsimplerecyclerview.list

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.uigitdev.android.kotlin.kotlinsimplerecyclerview.R

class ListAdapter(val context: Context, val arrayList: ArrayList<ItemObject>) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

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
        (holder).designItem.getButton().setOnClickListener(View.OnClickListener {
            Toast.makeText(context, "Item position: $position", Toast.LENGTH_SHORT).show()
        })
    }
}