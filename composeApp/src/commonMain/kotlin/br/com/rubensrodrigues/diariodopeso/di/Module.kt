package br.com.rubensrodrigues.diariodopeso.di

import br.com.rubensrodrigues.diariodopeso.presentation.journey.sign_up_data.SignUpDataViewModel
import br.com.rubensrodrigues.diariodopeso.presentation.journey.sign_up_password.SignUpPasswordViewModel
import br.com.rubensrodrigues.diariodopeso.presentation.journey.start.StartViewModel
import org.koin.core.module.dsl.viewModel
import org.koin.core.module.dsl.viewModelOf
import org.koin.dsl.module

val viewModelModule = module {
    viewModelOf(::StartViewModel)
    viewModelOf(::SignUpDataViewModel)

    viewModel { ( name: String, email: String) ->
        SignUpPasswordViewModel(
            email = name,
            name = email
        )
    }
}