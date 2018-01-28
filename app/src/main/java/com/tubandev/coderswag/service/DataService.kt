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
            Category("DIGITAL", "digitalgoodsimage")
    )

    val hats = listOf(
            Product("TubanDev Graphic Beanie", "$18", "hat01"),
            Product("TubanDev Hat Black", "$20", "hat02"),
            Product("TubanDev Hat White", "$18", "hat03"),
            Product("TubanDev Hat Snapback", "$22", "hat04")
    )

    val hoodies = listOf(
            Product("TubanDev Hoodie Gray", "$28", "hoodie01"),
            Product("TubanDev Hoodie Red", "$32", "hoodie02"),
            Product("TubanDev Hoodie Black", "$38", "hoodie03"),
            Product("TubanDev Hoodie Blue", "$22", "hoodie04")
    )

    val shirts = listOf(
            Product("TubanDev Shirt Gray", "$18", "shirt01"),
            Product("TubanDev Shirt Red", "$16", "shirt02"),
            Product("TubanDev Shirt Black", "$18", "shirt03"),
            Product("TubanDev Shirt Blue", "$22", "shirt04"),
            Product("Kickflip Studios", "$12", "shirt05")
    )
}