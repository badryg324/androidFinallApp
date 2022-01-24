package com.example.finalapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.service.autofill.OnClickAction
import android.view.View
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class AboutMeActivity : AppCompatActivity() {

    lateinit var listOfSongs : MutableList<String>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about_me)
        initListeners()
    }

    private fun initListeners() {
        val btnWhoCheck = findViewById<Button>(R.id.btnWhoCheck)
        btnWhoCheck.setOnClickListener(checkWhoListener)
    }

   val checkWhoListener=View.OnClickListener(){
       checkWhoNow()
   }

    private fun checkWhoNow() {
        Toast.makeText(this, R.string.whoAmI, Toast.LENGTH_SHORT).show()
    }

}