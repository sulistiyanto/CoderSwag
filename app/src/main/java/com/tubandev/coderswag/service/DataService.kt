package com.tubandev.coderswag.service

import com.tubandev.coderswag.model.Category
import com.tubandev.coderswag.model.Product

/**
 * Created by sulistiyanto on 28/01/18.
 */
object DataService {

    val categories = listOf(
            Category("SHIRTS", "shirtimage"),
            Category("HOODIES", "hoodieimage"),
            Category("HATS", "hatimage"),
            Category("DIGITAL", "digitalgoodsimage"),
            Category("SHIRTS", "shirtimage"),
            Category("HOODIES", "hoodieimage"),
            Category("HATS", "hatimage"),
            Category("DIGITAL", "digitalgoodsimage"),
            Category("SHIRTS", "shirtimage"),
            Category("HOODIES", "hoodieimage"),
            Category("HATS", "hatimage"),
            Category("DIGITAL", "digitalgoodsimage")
    )

    private val hats = listOf(
            Product("TubanDev Graphic Beanie", "$18", "hat1"),
            Product("TubanDev Hat Black", "$20", "hat2"),
            Product("TubanDev Hat White", "$18", "hat3"),
            Product("TubanDev Hat Snapback", "$22", "hat4")
    )

    private val hoodies = listOf(
            Product("TubanDev Hoodie Gray", "$28", "hoodie1"),
            Product("TubanDev Hoodie Red", "$32", "hoodie2"),
            Product("TubanDev Hoodie Black", "$38", "hoodie3"),
            Product("TubanDev Hoodie Blue", "$22", "hoodie4")
    )

    private val shirts = listOf(
            Product("TubanDev Shirt Gray", "$18", "shirt1"),
            Product("TubanDev Shirt Red", "$16", "shirt2"),
            Product("TubanDev Shirt Black", "$18", "shirt3"),
            Product("TubanDev Shirt Blue", "$22", "shirt4"),
            Product("Kickflip Studios", "$12", "shirt5")
    )

    private val digitalGood = listOf<Product>()

    fun getProduct(category: String) : List<Product> {

        return when(category) {
            "SHIRTS" -> shirts
            "HATS" -> hats
            "HOODIES" -> hoodies
            else -> digitalGood
        }
    }
}