package br.com.rubensrodrigues.diariodopeso.di

import br.com.rubensrodrigues.diariodopeso.utils.config.datastore.PlatformDataStore
import org.koin.dsl.module

val dataStoreModule = module {
    single { PlatformDataStore.get() }
}