package com.muhsanjaved.wavesoffood.ui.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import com.muhsanjaved.wavesoffood.databinding.ActivityChooseYourLocationBinding

class ChooseYourLocationActivity : AppCompatActivity() {

    private lateinit var binding: ActivityChooseYourLocationBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityChooseYourLocationBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val locationList =
            arrayOf("Sukun", "Lowokwaru", "Klojen", "Blimbing", "Kedungkadang", "Kiduldalem")
        val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, locationList)
        val autoCompleteTextView = binding.listOfLocation
        autoCompleteTextView.setAdapter(adapter)

        binding.btnGoToMainScreenButton.setOnClickListener {
            val intent = Intent(this@ChooseYourLocationActivity, MainActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}