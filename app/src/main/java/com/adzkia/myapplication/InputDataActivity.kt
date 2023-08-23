package com.adzkia.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.RadioButton
import com.adzkia.myapplication.databinding.ActivityInputDataBinding

class InputDataActivity : AppCompatActivity() {

    private lateinit var binding: ActivityInputDataBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityInputDataBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnSubmit.setOnClickListener {
            //mengambil nilai dari edit text
            val nama = binding.etName.text.toString()
            val email = binding.etEmail.text.toString()
            val nohp = binding.etNohp.text.toString()
            val alamat = binding.etAlamat.text.toString()

            //mengambil nilai dari radio button
            val selectedId = binding.rgJekel.checkedRadioButtonId
            var jekel = ""
            if (selectedId != -1) {
                jekel = findViewById<RadioButton>(selectedId).text.toString()
            }

            //mengambil nilai dari spinner
            val jenisTinggal = binding.spinTempatTinggal.selectedItem.toString()

            //mengambil nilai dari check box
            var perokok = "Iya"
            if ((binding.chkPerokok.isChecked)) {
                perokok = "Tidak"
            }
        }
    }
}