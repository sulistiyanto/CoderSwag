package com.tubandev.coderswag.controller

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.tubandev.coderswag.R
import com.tubandev.coderswag.utilities.EXTRA_CATEGORY

class ProductActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_product)

        val categoryType = intent.getStringExtra(EXTRA_CATEGORY)
    }
}
