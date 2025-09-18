package br.com.rubensrodrigues.diariodopeso.utils.config.datastore

import android.content.Context
import androidx.datastore.core.DataStore
import androidx.datastore.preferences.core.Preferences

private lateinit var appContext: Context
private val ds: DataStore<Preferences> by lazy {
    val file = appContext.filesDir.resolve(DATASTORE_FILE).absolutePath
    createDataStoreAt(file)
}

fun initPlatformDataStore(context: Context) {
    appContext = context.applicationContext
}

actual object PlatformDataStore {
    actual fun get(): DataStore<Preferences> = ds
}