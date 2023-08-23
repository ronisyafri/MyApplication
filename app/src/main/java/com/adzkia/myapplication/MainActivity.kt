package com.adzkia.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.adzkia.myapplication.databinding.ActivityMainBinding
import com.bumptech.glide.Glide

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

//        val btnLanjut: Button = findViewById(R.id.btn_lanjut)
//        val ivExample: ImageView = findViewById(R.id.iv_example)



        binding.btnLanjut.setOnClickListener {
            val intent = Intent(this@MainActivity, CalculatorActivity::class.java)
            startActivity(intent)
        }

        Glide.with(this@MainActivity)
            .load(R.drawable.screenshot1)
            .into(binding.ivExample)
    }


}