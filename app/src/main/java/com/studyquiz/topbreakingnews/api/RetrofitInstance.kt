package com.studyquiz.topbreakingnews.api

import com.studyquiz.topbreakingnews.util.Constants.Companion.BASE_URL

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class RetrofitInstance {
    companion object {
        // lazy - initialize only when it is called and return the same object every time
        private val retrofit by lazy {

            Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build()
        }

        val api by lazy {
            retrofit.create(NewsAPI::class.java)
        }
    }
}