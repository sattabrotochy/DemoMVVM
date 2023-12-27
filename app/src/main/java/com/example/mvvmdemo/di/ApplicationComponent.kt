package com.example.mvvmdemo.di

import com.example.mvvmdemo.MainActivity
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component (modules = [NetworkModule::class])
interface ApplicationComponent {

    fun inject(mainActivity: MainActivity)

}