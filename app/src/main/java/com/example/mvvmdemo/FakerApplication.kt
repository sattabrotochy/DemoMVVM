package com.example.mvvmdemo

import android.app.Application
import com.example.mvvmdemo.di.ApplicationComponent
import com.example.mvvmdemo.di.DaggerApplicationComponent


class FakerApplication:Application() {


    lateinit var  applicationComponent: ApplicationComponent
    override fun onCreate() {
        super.onCreate()
        applicationComponent=DaggerApplicationComponent.builder().build()
    }
}