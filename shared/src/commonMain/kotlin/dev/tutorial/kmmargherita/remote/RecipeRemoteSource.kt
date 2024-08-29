package dev.tutorial.kmmargherita.remote

import dev.tutorial.kmmargherita.api.RecipesApi

class RecipeRemoteSource(
    private val recipesApi: RecipesApi,
) {
    suspend fun getRecipes() = {}
}
