package br.com.rubensrodrigues.diariodopeso.data.remote.repository

import androidx.datastore.core.DataStore
import androidx.datastore.preferences.core.Preferences
import androidx.datastore.preferences.core.edit
import androidx.datastore.preferences.core.intPreferencesKey

interface SettingsRepository {
    suspend fun saveUserHeight(height: Int) {}
}

class SettingsRepositoryImpl(
    private val dataSource: DataStore<Preferences>,
): SettingsRepository {
    override suspend fun saveUserHeight(height: Int) {
        dataSource.edit { prefs ->
            prefs[USER_HEIGHT] = height
        }
    }
}

private val USER_HEIGHT = intPreferencesKey("user_height")