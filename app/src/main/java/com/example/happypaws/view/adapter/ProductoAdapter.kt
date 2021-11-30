package com.example.happypaws.view.adapter

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.appcompat.view.menu.ActionMenuItemView
import androidx.appcompat.view.menu.MenuView
import androidx.recyclerview.widget.RecyclerView
import com.example.happypaws.R
import com.example.happypaws.VerProducto

import com.example.happypaws.model.Producto
import org.w3c.dom.Text

//class ProductoAdapter(val productos:ArrayList<Producto>):RecyclerView.Adapter<ProductoAdapter.ViewHolder>(){}

class ProductoAdapter (val productos:ArrayList<Producto>): RecyclerView.Adapter<ProductoAdapter.ViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProductoAdapter.ViewHolder {
        var vista = LayoutInflater.from(parent.context).inflate(R.layout.item_producto,parent, false)
        return ViewHolder(vista)
    }

    override fun onBindViewHolder(holder: ProductoAdapter.ViewHolder, position: Int) {
      holder.bindItems(productos[position])
    }

    override fun getItemCount(): Int {
        return productos.size
    }
    class ViewHolder (itemView: View):RecyclerView.ViewHolder(itemView){
        init {
            itemView.setOnClickListener{
                itemView.context.startActivity(Intent(itemView.context, VerProducto::class.java))
            }
        }
    fun bindItems(producto: Producto){
        val nombre =itemView.findViewById<TextView>(R.id.item_nombre)
        nombre.text = producto.nombre
        }
    }

}