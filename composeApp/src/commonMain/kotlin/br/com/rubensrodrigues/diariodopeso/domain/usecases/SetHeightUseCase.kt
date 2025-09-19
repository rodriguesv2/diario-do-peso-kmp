package br.com.rubensrodrigues.diariodopeso.domain.usecases

import br.com.rubensrodrigues.diariodopeso.data.remote.repository.SettingsRepository

interface SetHeightUseCase {
    suspend operator fun invoke(height: Int): Result<Unit>
}

class SetHeightUseCaseImpl(
    private val settingsRepository: SettingsRepository,
) : SetHeightUseCase {
    override suspend fun invoke(height: Int): Result<Unit> {
        return runCatching {
            settingsRepository.saveUserHeight(height)
        }
    }
}