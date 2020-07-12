package com.inxteros.knihovnik

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import kotlinx.android.synthetic.main.activity_vse_pob.*

class vse_pob : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_vse_pob)
        val lidova = findViewById<Button>(R.id.lid_vsech)
        lidova.setOnClickListener {
            val intent = Intent(this, lid_cast::class.java)
            startActivity(intent)
        }
        val vedecka = findViewById<Button>(R.id.ved_vsech)
        vedecka.setOnClickListener {
            val intent = Intent(this, ved_cast::class.java)
            startActivity(intent)
        }
        val hor = findViewById<Button>(R.id.hor_vsech)
        hor.setOnClickListener {
            val intent = Intent(this, hornicka::class.java)
            startActivity(intent)
        }
        val kli = findViewById<Button>(R.id.kli_vsech)
        kli.setOnClickListener {
            val intent = Intent(this, klise::class.java)
            startActivity(intent)
        }
        val str = findViewById<Button>(R.id.str_vsech)
        str.setOnClickListener {
            val intent = Intent(this, stribrniky::class.java)
            startActivity(intent)
        }

    }
}