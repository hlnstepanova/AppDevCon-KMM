package dev.tutorial.kmmargherita.api

import dev.tutorial.kmmargherita.model.Recipe
import io.ktor.client.call.*
import io.ktor.client.request.*

class RecipesApi(private val ktorApi: KtorApi) : KtorApi by ktorApi {

    companion object {
        const val RECIPES_BASE_URL = "recipes"
    }

}
