package com.adzkia.myapplication

import android.content.Intent
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

            val intent = Intent (this@InputDataActivity, HasilInputActivity::class.java).apply {
               putExtra(TAG_NAME, nama)
               putExtra(TAG_EMAIL, email)
               putExtra(TAG_PHONE, nohp)
               putExtra(TAG_ADDRESS, alamat)
               putExtra(TAG_GENDER, jekel)
               putExtra(TAG_HOUSE, jenisTinggal)
               putExtra(TAG_SMOKING, perokok)
            }

            startActivity(intent)


        }
    }
    companion object{
        const val TAG_NAME = "nama"
        const val TAG_EMAIL = "email"
        const val TAG_PHONE = "noHp"
        const val TAG_ADDRESS = "alamat"
        const val TAG_GENDER = "jekel"
        const val TAG_HOUSE = "jenisTinggal"
        const val TAG_SMOKING = "perokok"
    }
}