package com.example.kmm_tutorial

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform