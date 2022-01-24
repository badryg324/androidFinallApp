package com.example.finalapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initListeners()
    }

    private fun initListeners() {
        val btnShowPlayList = findViewById<Button>(R.id.btnShowPlayListView)
        btnShowPlayList.setOnClickListener(btnShowPlayListListener)
        val btnBuyListView = findViewById<Button>(R.id.btnBuyListView)
        btnBuyListView.setOnClickListener(btnBuyListViewListener)
        val btnAddConcertDate = findViewById<Button>(R.id.btnAddConcertDate)
        btnAddConcertDate.setOnClickListener(btnAddConcertDateListener)
        val btnAboutAuthor = findViewById<Button>(R.id.btnAboutAuthorView)
        btnAboutAuthor.setOnClickListener(btnAboutAuthorListener)


    }
    val btnShowPlayListListener = View.OnClickListener { goToShowPlayList() }




    val btnBuyListViewListener = View.OnClickListener { goToBuyList() }

    val btnAddConcertDateListener = View.OnClickListener { goToAddConcertDate() }

    val btnAboutAuthorListener = View.OnClickListener { goToAboutMe() }


    private fun goToShowPlayList() {
        val intent = Intent(this, ShowPlayListActivity::class.java)
        startActivity(intent)
    }

    private fun goToBuyList() {
        val intent = Intent(this, BuyListActivity::class.java)
        startActivity(intent)
    }

    private fun goToAddConcertDate() {
        val intent = Intent(this, AddConcertDateActivity::class.java)
        startActivity(intent)
    }

    private fun goToAboutMe() {
        val intent = Intent(this, AboutMeActivity::class.java)
        startActivity(intent)
    }



}
