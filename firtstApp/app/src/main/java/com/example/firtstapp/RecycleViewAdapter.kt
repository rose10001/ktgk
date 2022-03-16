package com.example.firtstapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import java.util.*


class RecycleViewAdapter : RecyclerView.Adapter<RecycleViewAdapter.ViewHoder>() {

    private  var  cappicals : ArrayList<model> = ArrayList();

    fun submitList(list: ArrayList<model>){
        cappicals = list
    }


    class ViewHoder constructor(itemView : View) : RecyclerView.ViewHolder(itemView) {
        val textView  : TextView = itemView.findViewById(R.id.capitalText)
        val phone:TextView =itemView.findViewById(R.id.phone)
       fun  bind(cappical : model) {
           textView.setText(cappical.name)
            phone.setText(cappical.phone)
       }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHoder {
        return ViewHoder(
            LayoutInflater.from(parent.context).inflate(R.layout.capital_layout, parent, false)
        )
    }


    override fun onBindViewHolder(holder: ViewHoder, position: Int) {
        when(holder) {

            is ViewHoder -> {
                holder.bind(cappicals.get(position))
            }

        }
    }

    override fun getItemCount(): Int {
        return cappicals.size
    }
}