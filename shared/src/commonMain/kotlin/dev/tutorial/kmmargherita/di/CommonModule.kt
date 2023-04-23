package dev.tutorial.kmmargherita.di

import dev.tutorial.kmmargherita.api.KtorApi
import dev.tutorial.kmmargherita.api.KtorApiImpl
import dev.tutorial.kmmargherita.api.RecipesApi
import dev.tutorial.kmmargherita.remote.RecipeRemoteSource
import dev.tutorial.kmmargherita.repository.RecipeRepository
import dev.tutorial.kmmargherita.viewmodel.RecipeViewModel
import org.koin.core.context.startKoin
import org.koin.dsl.KoinAppDeclaration
import org.koin.dsl.module

fun initKoin(appDeclaration: KoinAppDeclaration) = startKoin {
    appDeclaration()
    modules(
        apiModule
    )
}

private val apiModule = module {

}
