package com.example.chechkactivity

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.chechkactivity.databinding.ItemproductsBinding

class Adapter :RecyclerView.Adapter<Adapter.ProductViewHolder> (){

private val productList =ArrayList<String>()
    inner class ProductViewHolder(val binding: ItemproductsBinding) :RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProductViewHolder {
        val layout =ItemproductsBinding.inflate(LayoutInflater.from(parent.context),parent,false)
    return ProductViewHolder(layout)
    }

    override fun getItemCount(): Int {
        return productList.size
    }

    override fun onBindViewHolder(holder: ProductViewHolder, position: Int) {
       val item = productList[position]
//        holder.binding.days.text=item
        holder.binding.weeks.text=item

    }

     fun updateAdapter(list :List<String>){

       productList.clear()

         productList.addAll(list)
         notifyDataSetChanged()


     }




}