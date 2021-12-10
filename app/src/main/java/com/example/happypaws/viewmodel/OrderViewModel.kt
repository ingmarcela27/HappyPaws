package com.example.happypaws.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.happypaws.model.Products
import com.example.happypaws.network.Callback
import com.example.happypaws.network.FirestoreService
import java.lang.Exception

class OrderViewModel: ViewModel() {
    val firestoreService = FirestoreService()
    val listProducts: MutableLiveData<List<Products>> = MutableLiveData()
    var isLoading = MutableLiveData<Boolean>()

    fun refresh() {
        getProductsFromFirebase()
    }

    private fun getProductsFromFirebase() {
        firestoreService.getProducts(object : Callback<List<Products>> {

            override fun onFailed(exception: Exception) {
                processFinished()
            }

            override fun onSuccess(result: List<Products>?) {
                listProducts.postValue(result)
                processFinished()
            }

        })
    }

    fun processFinished() {
        isLoading.value = true
    }
}