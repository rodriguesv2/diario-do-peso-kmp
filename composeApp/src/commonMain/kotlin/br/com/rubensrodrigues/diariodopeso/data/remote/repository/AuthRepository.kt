package br.com.rubensrodrigues.diariodopeso.data.remote.repository

import dev.gitlive.firebase.auth.AuthResult
import dev.gitlive.firebase.auth.FirebaseAuth

interface AuthRepository {
    suspend fun createUser(email: String, password: String): AuthResult
    suspend fun updateUser(displayName: String)
    fun getCurrentUserId(): String?
}

class AuthRepositoryImpl(
    private val auth: FirebaseAuth,
): AuthRepository {

    override suspend fun createUser(email: String, password: String) : AuthResult {
        return auth.createUserWithEmailAndPassword(email, password)
    }

    override suspend fun updateUser(displayName: String) {
        auth.currentUser?.updateProfile(displayName)
    }

    override fun getCurrentUserId(): String? {
        return auth.currentUser?.uid
    }
}