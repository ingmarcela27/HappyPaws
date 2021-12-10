package com.example.happypaws.model

import java.io.Serializable

//Este es el esquema de la base de datos.

class Products : Serializable {
    lateinit var name: String
    lateinit var reference: String
    lateinit var price: String
    lateinit var url: String
    lateinit var detail: String
}


