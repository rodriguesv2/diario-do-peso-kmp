package br.com.rubensrodrigues.diariodopeso.repository

import dev.gitlive.firebase.Firebase
import dev.gitlive.firebase.firestore.firestore

class TestRepository {
    suspend fun saveData(
        name: String,
        email: String,
    ) {
        Firebase.firestore.collection("users")
            .add(
                mapOf(
                    "name" to name,
                    "email" to email,
                ),
            )
    }
}