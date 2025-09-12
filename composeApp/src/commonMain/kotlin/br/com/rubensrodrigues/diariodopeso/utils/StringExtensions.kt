package br.com.rubensrodrigues.diariodopeso.utils

fun String.isEmail(): Boolean {
    val regex = Regex("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,}$", RegexOption.IGNORE_CASE)
    return isNotBlank() &&
            length <= 254 &&
            regex.matches(trim())
}