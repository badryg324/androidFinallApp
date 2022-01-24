package com.example.finalapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView
import org.w3c.dom.Text

class showGigActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_show_gig)


        var name = intent.getStringExtra("name")
        var place = intent.getStringExtra("place")
        var date = intent.getStringExtra("date")

        var editTextName = findViewById<TextView>(R.id.textViewEventName) as TextView
        var editTextPlace = findViewById<TextView>(R.id.textViewEventPlace) as TextView
        var editTextDate = findViewById<TextView>(R.id.textViewEventDate) as TextView

        editTextName.text = name;
        editTextPlace.text = place;
        editTextDate.text = date;
    }
}