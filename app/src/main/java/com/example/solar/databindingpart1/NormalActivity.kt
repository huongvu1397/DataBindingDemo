package com.example.solar.databindingpart1

import android.databinding.DataBindingUtil
import android.databinding.ObservableInt
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import com.example.solar.databindingpart1.databinding.ActivityNormalBinding
import com.example.solar.databindingpart1.model.NormalProfile
import kotlinx.android.synthetic.main.activity_normal.*

class NormalActivity:AppCompatActivity() {
    private val normalProfile = NormalProfile("Ada", "Lovelace", ObservableInt(0))
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding: ActivityNormalBinding = DataBindingUtil.setContentView(this, R.layout.activity_normal)
        binding.normal = normalProfile

    }

    fun onLike(view: View) {
        normalProfile.likes.set(normalProfile.likes.get() + 1)

    }
}