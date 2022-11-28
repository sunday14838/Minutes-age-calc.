package com.example.ageinminutescalculator

import android.app.DatePickerDialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import java.util.*

class MainActivity : AppCompatActivity() {
    var date:TextView?=null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val datePicker: Button = findViewById(R.id.datepicker)
        date=findViewById(R.id.dateButton)

        datePicker.setOnClickListener { datePickerButton()}
    }

    fun datePickerButton(){
        val myCalender=Calendar.getInstance()
        val year=myCalender.get(Calendar.YEAR)
        val month=myCalender.get(Calendar.MONTH)
        val day=myCalender.get(Calendar.DAY_OF_MONTH)

        DatePickerDialog(this,
            DatePickerDialog.OnDateSetListener{ _, year, month, dayOfMonth ->
                Toast.makeText(this, "pressed", Toast.LENGTH_LONG).show()

                var selected="$dayOfMonth/${month+1}/$year"
                date?.setText(selected)
            },
            year,
            month,
            day
        ).show()


    }
}
//
//fun datePickerButton(){
//    val myCalender=Calendar.getInstance()
//    val year=myCalender.get(Calendar.YEAR)
//    val month=myCalender.get(Calendar.MONTH)
//    val day=myCalender.get(Calendar.DAY_OF_MONTH)
//
//    DatePickerDialog(this,
//    DatePickerDialog.OnDateSetListener{ _, year, month, dayOfMonth ->
//        Toast.makeText(this, "pressed", Toast.LENGTH_LONG).show()
//    },
//    year,
//    month,
//    day
//    ).show()
//
//
//}