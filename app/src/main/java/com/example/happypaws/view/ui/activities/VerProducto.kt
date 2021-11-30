package com.example.happypaws.view.ui.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import androidx.appcompat.widget.Toolbar
import com.example.happypaws.R

class VerProducto : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ver_producto)

        var toolbar = findViewById<Toolbar>(R.id.toolbar)
        setSupportActionBar(toolbar)

        //boton regresar
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.setDisplayShowHomeEnabled(true)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (item.itemId == android.R.id.home) {
            finish()
        }
        return super.onOptionsItemSelected(item)
    }
}