package com.inxteros.knihovnik

import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import android.provider.CalendarContract
import android.view.View
import android.widget.RadioButton
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.app.AppCompatDelegate
import androidx.core.view.isVisible
import androidx.preference.PreferenceFragmentCompat

class SettingsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.settings_activity)

        val svetly = findViewById<RadioButton>(R.id.svetly)
            svetly.setOnClickListener {
                AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)
                val tl_tma = findViewById<RadioButton>(R.id.tmavy)
                tl_tma.isChecked = false
                val tl_aut = findViewById<RadioButton>(R.id.automaticky)
                tl_aut.isChecked = false
                val txt_auto = findViewById<TextView>(R.id.text_auto)
                txt_auto.visibility= View.GONE
        }
        val tmavy = findViewById<RadioButton>(R.id.tmavy)
        tmavy.setOnClickListener {
                AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES)
                val tl_sve = findViewById<RadioButton>(R.id.svetly)
                tl_sve.isChecked = false
                val tl_aut = findViewById<RadioButton>(R.id.automaticky)
                tl_aut.isChecked = false
                val txt_auto = findViewById<TextView>(R.id.text_auto)
                txt_auto.visibility= View.GONE

        }
        val automaticky = findViewById<RadioButton>(R.id.automaticky)
            automaticky.setOnClickListener {
                AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_FOLLOW_SYSTEM)
                val tl_sve = findViewById<RadioButton>(R.id.svetly)
                tl_sve.isChecked = false
                val tl_tma = findViewById<RadioButton>(R.id.tmavy)
                tl_tma.isChecked = false
                val txt_auto = findViewById<TextView>(R.id.text_auto)
                txt_auto.visibility = View.VISIBLE
            }
    }
}