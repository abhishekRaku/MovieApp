package com.example.movieapp.utils

enum class Api(private val url: String) {
    BASE_URL("https://api.themoviedb.org/3/"),
    API_KEY("6e63c2317fbe963d76c3bdc2b785f6d1"),
    POSTER_BASE_URL("https://image.tmdb.org/t/p/w342");

    fun getValue(): String{
        return url
    }
}