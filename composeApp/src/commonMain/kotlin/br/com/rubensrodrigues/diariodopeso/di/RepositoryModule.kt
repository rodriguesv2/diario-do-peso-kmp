package br.com.rubensrodrigues.diariodopeso.di

import br.com.rubensrodrigues.diariodopeso.data.remote.repository.AuthRepository
import br.com.rubensrodrigues.diariodopeso.data.remote.repository.AuthRepositoryImpl
import br.com.rubensrodrigues.diariodopeso.data.remote.repository.FirestoreRepository
import br.com.rubensrodrigues.diariodopeso.data.remote.repository.FirestoreRepositoryImpl
import org.koin.core.module.dsl.singleOf
import org.koin.dsl.bind
import org.koin.dsl.module

val repositoryModule = module {
    singleOf(::AuthRepositoryImpl) bind AuthRepository::class
    singleOf(::FirestoreRepositoryImpl) bind FirestoreRepository::class
}