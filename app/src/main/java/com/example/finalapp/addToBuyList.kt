package com.example.finalapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText

class addToBuyList : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_to_buy_list)
        initListeners()
    }

    private fun initListeners() {
        val changeButton = findViewById<Button>(R.id.changeShouldBuyButton)
        changeButton.setOnClickListener(changeButtonListener)
    }

    val changeButtonListener = View.OnClickListener(){ changeNow()}

    private fun changeNow() {
        val something = findViewById<EditText>(R.id.editTextWhatShouldBuy)
        val intent = Intent()
        if(something.text.toString().isEmpty()){
            setResult(RESULT_CANCELED, intent)
        }
        else {
            intent.putExtra("RESULT",something.text.toString())
            setResult(RESULT_OK,intent)
        }
        finish()
    }
}