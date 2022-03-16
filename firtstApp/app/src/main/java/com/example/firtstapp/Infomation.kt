package com.example.firtstapp


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

import java.util.*

import kotlin.collections.ArrayList

class Infomation : AppCompatActivity() {

    lateinit var  countries : RecyclerView
    lateinit var adapterZ : RecycleViewAdapter

    lateinit var name:String
    lateinit var phone:String
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_infomation);

        countries = findViewById(R.id.countries)
        adapterZ  = RecycleViewAdapter()

        name = intent.getStringExtra("name").toString()
        phone = intent.getStringExtra("phone").toString()

        addDataSet()
        initRecyclerView()
    }


    private fun addDataSet(){
        val cappicals : ArrayList<model> = ArrayList();
        var b = model("hhh","12333333")
        cappicals.add(b)

        var c = model("dũng","111111")
        cappicals.add(c)

        var d = model(name,phone)
        cappicals.add(d)
        adapterZ.submitList(cappicals)
    }

    private fun initRecyclerView(){

        countries.apply {
            layoutManager = LinearLayoutManager(context)
            adapter = adapterZ
        }
    }
}