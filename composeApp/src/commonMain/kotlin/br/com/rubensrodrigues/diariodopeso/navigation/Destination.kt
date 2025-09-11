package br.com.rubensrodrigues.diariodopeso.navigation

import kotlinx.serialization.Serializable

sealed interface Destination {
    @Serializable
    data object Start : Destination

    @Serializable
    data object SignUpData : Destination

    @Serializable
    data class SignUpPassword(
        val name: String,
        val email: String,
    ) : Destination
}