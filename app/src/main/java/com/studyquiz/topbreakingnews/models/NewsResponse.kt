package com.studyquiz.topbreakingnews.models


data class NewsResponse(
    val articles: MutableList<Article>,
    val status: String,
    val totalResults: Int
)