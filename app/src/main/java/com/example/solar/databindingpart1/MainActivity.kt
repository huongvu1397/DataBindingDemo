package com.example.solar.databindingpart1

import android.content.Intent
import android.databinding.DataBindingUtil
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.solar.databindingpart1.databinding.ActivityMainBinding
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val binding: ActivityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        binding.mNormal.setOnClickListener { startActivity(Intent(this, NormalActivity::class.java))
        Toast.makeText(this,"Ví dụ cơ bản về Data Binding",Toast.LENGTH_LONG).show()}


    }
}

