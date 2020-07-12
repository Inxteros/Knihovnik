package com.inxteros.knihovnik

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.RadioButton
import androidx.cardview.widget.CardView
import androidx.preference.PreferenceManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

         val nastaveni = findViewById<Button>(R.id.tl_nastaveni)
            nastaveni.setOnClickListener {
                val intent = Intent(this, SettingsActivity::class.java)
                startActivity(intent)
            }
        val lidova = findViewById<Button>(R.id.lidov_tl)
            lidova.setOnClickListener {
            val intent = Intent(this, lid_cast::class.java)
            startActivity(intent)}

        val vedecka = findViewById<Button>(R.id.vedec_tl)
        vedecka.setOnClickListener {
            val intent = Intent(this, ved_cast::class.java)
            startActivity(intent)}

        val vsechno = findViewById<CardView>(R.id.cardView)
                vsechno.setOnClickListener {
                    val vse1 = Intent(this, vse_pob::class.java)
                    startActivity(vse1)
                }

        }
    }