package br.com.rubensrodrigues.diariodopeso.utils.config.datastore

import androidx.datastore.core.DataStore
import androidx.datastore.preferences.core.Preferences

expect object PlatformDataStore {
    fun get(): DataStore<Preferences>
}