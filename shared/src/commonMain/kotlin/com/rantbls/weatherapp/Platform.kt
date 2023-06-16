package com.rantbls.weatherapp

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform