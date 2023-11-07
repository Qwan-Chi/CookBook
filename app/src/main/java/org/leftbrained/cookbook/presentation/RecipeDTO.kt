package org.leftbrained.cookbook.presentation

import org.leftbrained.cookbook.R

data class RecipeDTO(val name: String, val description: Int, val image: Int, val icon: Int)

var main = listOf(
    RecipeDTO(
        "Блинчик", R.string.blinchik_desc, R.drawable.blinchik, R.drawable.ic_blinchik
    ), RecipeDTO(
        "Борщ", R.string.borsch_desc, R.drawable.borsch, R.drawable.ic_borsch
    ), RecipeDTO(
        "Спагетти", R.string.spagetti_desc, R.drawable.spagetti, R.drawable.ic_spagetti
    ), RecipeDTO(
        "Милкшейк", R.string.milkshake_desc, R.drawable.milkshake, R.drawable.ic_milkshake
    ), RecipeDTO(
        "Цезарь", R.string.cesar_desc, R.drawable.cesar, R.drawable.ic_cesar
    )
)