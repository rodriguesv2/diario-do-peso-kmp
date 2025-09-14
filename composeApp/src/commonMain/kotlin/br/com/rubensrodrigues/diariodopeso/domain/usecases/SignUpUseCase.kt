package br.com.rubensrodrigues.diariodopeso.domain.usecases

import br.com.rubensrodrigues.diariodopeso.data.remote.repository.AuthRepository
import br.com.rubensrodrigues.diariodopeso.data.remote.repository.FirestoreRepository

interface SignUpUseCase {
    suspend operator fun invoke(
        name: String,
        email: String,
        password: String,
    ): Result<Unit>
}

class SignUpUseCaseImpl(
    private val authRepository: AuthRepository,
    private val firestoreRepository: FirestoreRepository,
): SignUpUseCase {
    override suspend fun invoke(
        name: String,
        email: String,
        password: String,
    ): Result<Unit> {
        return runCatching {
            val response = authRepository.createUser(
                email = email,
                password = password,
            )

            authRepository.updateUser(name)

            response.user?.uid?.let {
                firestoreRepository.createUserDocument(
                    uid = it,
                    name = name,
                    email = email,
                )
            }
        }
    }
}