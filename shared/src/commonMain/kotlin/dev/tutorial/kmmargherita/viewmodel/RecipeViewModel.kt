package dev.tutorial.kmmargherita.viewmodel

import dev.tutorial.kmmargherita.model.Recipe
import dev.tutorial.kmmargherita.repository.RecipeRepository
import dev.tutorial.kmmargherita.util.CoroutineViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach
import kotlinx.coroutines.launch
import org.koin.core.component.KoinComponent
import org.koin.core.component.inject

class RecipeViewModel : KoinComponent {

    private val recipeRepository: RecipeRepository by inject()

    private val _recipes = MutableStateFlow<List<Recipe>>(emptyList())
    val recipes = _recipes.asStateFlow()

}
