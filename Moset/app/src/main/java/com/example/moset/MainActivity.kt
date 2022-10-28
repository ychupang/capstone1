package com.example.moset

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.TextView



class MainActivity : AppCompatActivity() {
    fun admin(){
        setContentView(R.layout.activity_admin)
        val btn_home: ImageButton = findViewById(R.id.btn_home)
        val btn_closet: ImageButton = findViewById(R.id.btn_closet)
        val btn_admin: ImageButton = findViewById(R.id.btn_admin)
        val btn_calender: ImageButton = findViewById(R.id.btn_calender)
        btn_closet.setOnClickListener {
            closet()
        }
        btn_home.setOnClickListener {
            home()
        }
        btn_calender.setOnClickListener {
            calender()
        }
        btn_admin.setOnClickListener {
            admin()
        }
    }
    fun home(){
        setContentView(R.layout.activity_home)
        val btn_home: ImageButton = findViewById(R.id.btn_home)
        val btn_closet: ImageButton = findViewById(R.id.btn_closet)
        val btn_admin: ImageButton = findViewById(R.id.btn_admin)
        val btn_calender: ImageButton = findViewById(R.id.btn_calender)
        btn_closet.setOnClickListener {
            closet()
        }
        btn_home.setOnClickListener {
            home()
        }
        btn_calender.setOnClickListener {
            calender()
        }
        btn_admin.setOnClickListener {
            admin()
        }
    }
    fun calender(){
        setContentView(R.layout.activity_calander)
        val btn_home: ImageButton = findViewById(R.id.btn_home)
        val btn_closet: ImageButton = findViewById(R.id.btn_closet)
        val btn_admin: ImageButton = findViewById(R.id.btn_admin)
        val btn_calender: ImageButton = findViewById(R.id.btn_calender)
        btn_closet.setOnClickListener {
            closet()
        }
        btn_home.setOnClickListener {
            home()
        }
        btn_calender.setOnClickListener {
            calender()
        }
        btn_admin.setOnClickListener {
            admin()
        }
    }
    fun closet(){
        setContentView(R.layout.activity_closet)
        val btn_home: ImageButton = findViewById(R.id.btn_home)
        val btn_closet: ImageButton = findViewById(R.id.btn_closet)
        val btn_admin: ImageButton = findViewById(R.id.btn_admin)
        val btn_calender: ImageButton = findViewById(R.id.btn_calender)
        btn_closet.setOnClickListener {
            closet()
        }
        btn_home.setOnClickListener {
            home()
        }
        btn_calender.setOnClickListener {
            calender()
        }
        btn_admin.setOnClickListener {
            admin()
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_admin)
        admin()
    }
}