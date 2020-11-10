package com.uigitdev.android.kotlin.kotlinsimplerecyclerview

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.uigitdev.android.kotlin.kotlinsimplerecyclerview.list.ItemClickListener
import com.uigitdev.android.kotlin.kotlinsimplerecyclerview.list.ItemObject
import com.uigitdev.android.kotlin.kotlinsimplerecyclerview.list.ListAdapter

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setAdapter()
    }

    private fun setAdapter() {
        val recyclerView: RecyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this@MainActivity)
        val adapter = ListAdapter(initList(), object : ItemClickListener {
            override fun onItemClick(position: Int) {
                showToast(position)
            }
        })
        recyclerView.adapter = adapter
    }

    private fun showToast(position : Int){
        Toast.makeText(this@MainActivity, "Item position: $position", Toast.LENGTH_SHORT).show()
    }

    private fun initList(): ArrayList<ItemObject> {
        val arrayList = ArrayList<ItemObject>()

        arrayList.add(ItemObject("Title 1", "Subtitle 1"))
        arrayList.add(ItemObject("Title 2", "Subtitle 2"))
        arrayList.add(ItemObject("Title 3", "Subtitle 3"))
        arrayList.add(ItemObject("Title 4", "Subtitle 4"))
        arrayList.add(ItemObject("Title 5", "Subtitle 5"))

        return arrayList
    }
}