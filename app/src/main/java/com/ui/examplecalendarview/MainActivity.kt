package com.ui.examplecalendarview

import android.os.Bundle
import android.widget.CalendarView
import androidx.appcompat.app.AppCompatActivity
import java.util.*


class MainActivity : AppCompatActivity() {
   lateinit var calendar: Calendar

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        calendar = Calendar.getInstance()

        calendar.set(Calendar.MONTH, Calendar.NOVEMBER)
        calendar.set(Calendar.DAY_OF_MONTH, 9)
        calendar.set(Calendar.YEAR, 2012)
        calendar.add(Calendar.DAY_OF_MONTH, 1)
        calendar.add(Calendar.YEAR, 1)


    }
}