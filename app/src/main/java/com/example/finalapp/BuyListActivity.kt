package com.example.finalapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class BuyListActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_buy_list)
        initListeners()
    }

    private fun initListeners() {
        val btnAddShouldBuy = findViewById<Button>(R.id.btnShouldBuy)
        btnAddShouldBuy.setOnClickListener(addShouldBuyListener)
    }

    val addShouldBuyListener = View.OnClickListener(){goToAddToBuyList()}

    private fun goToAddToBuyList() {
        val intentWithResult = Intent(this, addToBuyList::class.java)
        startActivityForResult(intentWithResult, 2)
    }



    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode,  data)
        var result: String? = ""
        if (requestCode == 2) {
            if (resultCode == RESULT_OK) {
                result = data!!.getStringExtra("RESULT")
            } else if (resultCode == RESULT_CANCELED) {
                result = "No data"
            }
        }
        val textView = findViewById<TextView>(R.id.textView9)
        textView.text = result
    }
}