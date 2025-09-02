package br.com.rubensrodrigues.diariodopeso

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform