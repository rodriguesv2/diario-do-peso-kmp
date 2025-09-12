package br.com.rubensrodrigues.diariodopeso.di

import br.com.rubensrodrigues.diariodopeso.presentation.journey.signUpData.SignUpDataViewModel
import br.com.rubensrodrigues.diariodopeso.presentation.journey.start.StartViewModel
import org.koin.core.module.dsl.viewModelOf
import org.koin.dsl.module

val viewModelModule = module {
    viewModelOf(::StartViewModel)
    viewModelOf(::SignUpDataViewModel)
}