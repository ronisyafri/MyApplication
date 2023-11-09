package com.adzkia.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.adzkia.myapplication.InputDataActivity.Companion.TAG_ADDRESS
import com.adzkia.myapplication.InputDataActivity.Companion.TAG_EMAIL
import com.adzkia.myapplication.InputDataActivity.Companion.TAG_GENDER
import com.adzkia.myapplication.InputDataActivity.Companion.TAG_HOUSE
import com.adzkia.myapplication.InputDataActivity.Companion.TAG_NAME
import com.adzkia.myapplication.InputDataActivity.Companion.TAG_PHONE
import com.adzkia.myapplication.InputDataActivity.Companion.TAG_SMOKING
import com.adzkia.myapplication.databinding.ActivityHasilInputBinding

class HasilInputActivity : AppCompatActivity() {

    private lateinit var binding: ActivityHasilInputBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHasilInputBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val nama = intent.getStringExtra(TAG_NAME)
        val email = intent.getStringExtra(TAG_EMAIL)
        val phone = intent.getStringExtra(TAG_PHONE)
        val address = intent.getStringExtra(TAG_ADDRESS)
        val gender = intent.getStringExtra(TAG_GENDER)
        val house = intent.getStringExtra(TAG_HOUSE)
        val smoking = intent.getStringExtra(TAG_SMOKING)

        binding.apply {
            tvName.text = nama
            tvEmail.text = email
            tvHp.text = phone
            tvAddress.text = address
            tvGender.text = gender
            tvHouse.text = house
            tvSmoking.text = smoking

            ivBack.setOnClickListener {
                finish()
            }
        }
    }
}