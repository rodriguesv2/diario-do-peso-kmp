package br.com.rubensrodrigues.diariodopeso.utils.config.datastore

import androidx.datastore.core.DataStore
import androidx.datastore.preferences.core.Preferences
import platform.Foundation.NSDocumentDirectory
import platform.Foundation.NSSearchPathForDirectoriesInDomains
import platform.Foundation.NSUserDomainMask

private val ds: DataStore<Preferences> by lazy {
    val paths = NSSearchPathForDirectoriesInDomains(
        NSDocumentDirectory, NSUserDomainMask, true
    )
    val documents = paths.first() as String
    createDataStoreAt("$documents/$DATASTORE_FILE")
}

actual object PlatformDataStore {
    actual fun get(): DataStore<Preferences> = ds
}