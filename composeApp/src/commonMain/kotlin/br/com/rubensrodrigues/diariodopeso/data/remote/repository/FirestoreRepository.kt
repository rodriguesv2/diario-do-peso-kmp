package br.com.rubensrodrigues.diariodopeso.data.remote.repository

import br.com.rubensrodrigues.diariodopeso.data.remote.models.request.CreateUserRequest
import dev.gitlive.firebase.firestore.FirebaseFirestore

interface FirestoreRepository {
    suspend fun createUserDocument(
        uid: String,
        name: String,
        email: String,
    )
}

class FirestoreRepositoryImpl(
    private val remoteDb: FirebaseFirestore,
) : FirestoreRepository {
    override suspend fun createUserDocument(
        uid: String,
        name: String,
        email: String,
    ) {
        val request = CreateUserRequest(
            name = name,
            email = email,
        )
        remoteDb
            .collection("users")
            .document(uid)
            .set(request)
    }

}