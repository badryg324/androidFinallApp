package com.example.finalapp



import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText


class AddConcertDateActivity : AppCompatActivity() {

    val event_name = ""
    val event_place = ""
    val event_date = ""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_concert_date)
        initListeners()
    }


     fun initListeners() {
        val btnAddGig = findViewById<Button>(R.id.btnAddGig)
        btnAddGig.setOnClickListener(addGigListener)

    }

    val addGigListener = View.OnClickListener { addGig() }

    public fun addGig() {
        val event_nameET = findViewById<EditText>(R.id.editTextEventName) as EditText
        val event_placeET = findViewById<EditText>(R.id.EditTextPlaceName) as EditText
        val event_dateET = findViewById<EditText>(R.id.editTextDate) as EditText

         val event_name = event_nameET.text.toString()
         val event_place = event_placeET.text.toString()
         val event_date = event_dateET.text.toString()

        val intent = Intent(this,showGigActivity::class.java)
        intent.putExtra("name",event_name.toString())
        intent.putExtra("place", event_place.toString())
        intent.putExtra("date", event_date.toString())
        startActivity(intent)
    }




}