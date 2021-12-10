package com.example.happypaws.view.adapter

import com.example.happypaws.model.Products

//esta interface cumple la funcion de al dar clic en un producto, capturemos ese producto y su posicion.

interface ProductsListener {
    fun OnProductsClick(product: Products, position: Int)
}