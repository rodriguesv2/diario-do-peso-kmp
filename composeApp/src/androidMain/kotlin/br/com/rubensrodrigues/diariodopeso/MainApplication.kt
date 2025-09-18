package br.com.rubensrodrigues.diariodopeso

import android.app.Application
import br.com.rubensrodrigues.diariodopeso.utils.config.datastore.initPlatformDataStore

class MainApplication: Application() {

    override fun onCreate() {
        super.onCreate()
        initPlatformDataStore(this)
    }
}