package com.example.sunnyweather

import android.annotation.SuppressLint
import android.app.Application
import android.content.Context

class SunnyWeatherApplication: Application() {
    companion object{
        @SuppressLint("StaticFieldLeak")
        lateinit var context: Context
        const val TOKEN="e5g10ZJQO3pL8lQx"
    }

    override fun onCreate() {
        super.onCreate()
        context=applicationContext
    }
}