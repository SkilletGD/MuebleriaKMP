package com.skillet.muebleria

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform