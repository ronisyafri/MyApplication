package com.adzkia.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.adzkia.myapplication.databinding.ActivityCalculatorBinding
import kotlin.math.roundToInt

class CalculatorActivity : AppCompatActivity() {

    private lateinit var binding: ActivityCalculatorBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCalculatorBinding.inflate(layoutInflater)
        setContentView(binding.root)

//        val etInput1 : EditText = findViewById(R.id.et_input1)
//        val etInput2 : EditText = findViewById(R.id.et_input2)
//        val btnTambah : Button = findViewById(R.id.btn_tambah)
//        val btnKurang : Button = findViewById(R.id.btn_kurang)
//        val btnKali : Button = findViewById(R.id.btn_kali)
//        val btnBagi : Button = findViewById(R.id.btn_bagi)
//        val tvHasil : TextView = findViewById(R.id.tv_hasil)

        binding.btnTambah.setOnClickListener {
            val input1 = binding.etInput1.text.toString()
            val input2 = binding.etInput2.text.toString()
            if (input1.isNotEmpty() and input2.isNotEmpty()){
                val hasil = input1.toInt() + input2.toInt()

                binding.tvHasil.text = hasil.toString()
            } else {
                Toast.makeText(this@CalculatorActivity, "Input tidak boleh kosong", Toast.LENGTH_SHORT).show()
            }
        }

        binding.btnKurang.setOnClickListener {
            val input1 = binding.etInput1.text.toString()
            val input2 = binding.etInput2.text.toString()
            if (input1.isNotEmpty() and input2.isNotEmpty()){
                val hasil = input1.toInt() - input2.toInt()
                binding.tvHasil.text = hasil.toString()
            } else {
                Toast.makeText(this@CalculatorActivity, "Input tidak boleh kosong", Toast.LENGTH_SHORT).show()
            }
        }

        binding.btnKali.setOnClickListener {
            val input1 = binding.etInput1.text.toString()
            val input2 = binding.etInput2.text.toString()
            if(input1.isNotEmpty() and input2.isNotEmpty()){
                val hasil = input1.toInt() * input2.toInt()
                binding.tvHasil.text = hasil.toString()
            } else {
                Toast.makeText(this@CalculatorActivity, "Input tidak boleh kosong", Toast.LENGTH_SHORT).show()
            }
        }

        binding.btnBagi.setOnClickListener {
            val input1 = binding.etInput1.text.toString()
            val input2 = binding.etInput2.text.toString()
            if (input1.isNotEmpty() and input2.isNotEmpty()){
                val hasil = input1.toDouble() / input2.toDouble()
                val limithasil = (hasil * 1000.0).roundToInt() /1000.0
                binding.tvHasil.text = limithasil.toString()
            } else {
                Toast.makeText(this@CalculatorActivity, "Input tidak boleh kosong", Toast.LENGTH_SHORT).show()
            }
        }

        binding.btnNext.setOnClickListener {
            val intent = Intent (this@CalculatorActivity, InputDataActivity::class.java)
            startActivity(intent)
        }
    }
}