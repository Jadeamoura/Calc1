package com.example.calc1

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.calc1.databinding.ActivityMainBinding
import java.text.NumberFormat
import kotlin.math.round

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.calcButton.setOnClickListener {
            calculateTip()
        }
    }

    private fun calculateTip() {
        val bill = binding.billInput.text.toString().toDoubleOrNull()
        val tipPct = binding.tipInput.text.toString().toDoubleOrNull()

        if (bill == null || tipPct == null) {
            Toast.makeText(this, "Enter valid bill and tip %", Toast.LENGTH_SHORT).show()
            return
        }

        val tip = bill * (tipPct / 100.0)
        val total = bill + tip
        val currency = NumberFormat.getCurrencyInstance()

        binding.resultText.text =
            "Tip: ${currency.format(round(tip * 100) / 100)}   •   Total: ${currency.format(round(total * 100) / 100)}"
    }
}
