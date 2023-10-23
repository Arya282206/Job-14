package com.example.fragment

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val Merah = findViewById<Button>(R.id.FragmentMerah)
        val Biru = findViewById<Button>(R.id.FragmentBiru)
        val PPLG = findViewById<Button>(R.id.PPLG)
        val Busana = findViewById<Button>(R.id.Busana)
        val To = findViewById<Button>(R.id.TO)

        Merah.setOnClickListener {
            val fragmentTransaction = supportFragmentManager.beginTransaction()
            fragmentTransaction.replace(R.id.FragmentContainer , RedFragment())
            fragmentTransaction.commit()
        }

        Biru.setOnClickListener {
            val fragmentTransaction = supportFragmentManager.beginTransaction()
            fragmentTransaction.replace(R.id.FragmentContainer , BlueFragment())
            fragmentTransaction.commit()
        }

        PPLG.setOnClickListener {
            val fragmentTransaction = supportFragmentManager.beginTransaction()
            fragmentTransaction.replace(R.id.FragmentContainer , PPLG())
            fragmentTransaction.commit()
        }

        To.setOnClickListener {
            val fragmentTransaction = supportFragmentManager.beginTransaction()
            fragmentTransaction.replace(R.id.FragmentContainer , To())
            fragmentTransaction.commit()
        }

        Busana.setOnClickListener {
            val fragmentTransaction = supportFragmentManager.beginTransaction()
            fragmentTransaction.replace(R.id.FragmentContainer , Busana())
            fragmentTransaction.commit()
        }

        }
    }
