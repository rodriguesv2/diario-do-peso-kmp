package br.com.rubensrodrigues.diariodopeso.data.remote.models.request

import dev.gitlive.firebase.firestore.FieldValue

data class CreateUserRequest(
    val name: String,
    val email: String,
    val createdAt: FieldValue = FieldValue.serverTimestamp,
    val updatedAt: FieldValue = FieldValue.serverTimestamp,
)
