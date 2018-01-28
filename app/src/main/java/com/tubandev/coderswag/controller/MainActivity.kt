package com.tubandev.coderswag.controller

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.tubandev.coderswag.R
import com.tubandev.coderswag.adapters.CategoryAdapter
import com.tubandev.coderswag.service.DataService
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var adapter : CategoryAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        adapter = CategoryAdapter(this, DataService.categories)

        categoryListView.adapter = adapter
    }
}

