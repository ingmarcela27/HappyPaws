package com.example.happypaws.network

import java.lang.Exception

//en el paquete network se colocan los recursos de red que permitiran interactuar con la base de datos firebase.
//Callback, es un archivo de tipo interface.

    interface Callback <T>{
        fun onSuccess(result: T?)

        fun onFailed(exception: Exception)
    }
