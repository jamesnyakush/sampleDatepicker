package com.example.sampledatepicker

import android.annotation.SuppressLint
import android.app.DatePickerDialog
import android.app.DatePickerDialog.OnDateSetListener
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.sampledatepicker.databinding.ActivityMainBinding
import java.util.*


class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.edtDate.setOnClickListener {
            val cldr: Calendar = Calendar.getInstance()
            val day: Int = cldr.get(Calendar.DAY_OF_MONTH)
            val month: Int = cldr.get(Calendar.MONTH)
            val year: Int = cldr.get(Calendar.YEAR)


            DatePickerDialog(
                this,
                OnDateSetListener { view, year, monthOfYear, dayOfMonth ->
                    binding.edtDate.setText(dayOfMonth.toString() + "/" + (monthOfYear + 1) + "/" + year)
                },
                year,
                month,
                day
            ).show()
        }

        binding.edtDate2.setOnClickListener {
            val cldr: Calendar = Calendar.getInstance()
            val day: Int = cldr.get(Calendar.DAY_OF_MONTH)
            val month: Int = cldr.get(Calendar.MONTH)
            val year: Int = cldr.get(Calendar.YEAR)


            DatePickerDialog(
                this,
                OnDateSetListener { view, year, monthOfYear, dayOfMonth ->
                    binding.edtDate2.setText(dayOfMonth.toString() + "/" + (monthOfYear + 1) + "/" + year)
                },
                year,
                month,
                day
            ).show()
        }

        binding.btnDate.setOnClickListener {

            binding.date.text = "Selected Date: " + binding.edtDate.text

        }
    }
}