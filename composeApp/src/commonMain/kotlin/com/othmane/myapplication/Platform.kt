package com.othmane.myapplication

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform