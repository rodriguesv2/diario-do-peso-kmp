package br.com.rubensrodrigues.diariodopeso.di

import br.com.rubensrodrigues.diariodopeso.domain.usecases.SignUpUseCase
import br.com.rubensrodrigues.diariodopeso.domain.usecases.SignUpUseCaseImpl
import org.koin.core.module.dsl.factoryOf
import org.koin.dsl.bind
import org.koin.dsl.module

val useCaseModule = module {
    factoryOf(::SignUpUseCaseImpl) bind SignUpUseCase::class
}