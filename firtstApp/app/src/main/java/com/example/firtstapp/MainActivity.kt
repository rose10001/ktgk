package com.example.firtstapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val intent = Intent(this,Infomation::class.java);

        val add : Button = findViewById(R.id.add);
        val name : EditText = findViewById(R.id.name);
        val phone : EditText =findViewById(R.id.phone);

        add.setOnClickListener {
            intent.putExtra("name" , name.text.toString())
            intent.putExtra("phone", phone.text.toString())
            startActivity(intent);
        }
    }



}