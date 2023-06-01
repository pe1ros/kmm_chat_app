package com.example.chatapp

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform