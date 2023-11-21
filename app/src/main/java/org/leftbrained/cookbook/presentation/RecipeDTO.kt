package org.leftbrained.cookbook.presentation

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import org.leftbrained.cookbook.R

data class RecipeDTO(val name: String, val description: Int, val image: @Composable () -> Unit, val icon: Int)

var main = listOf(
    RecipeDTO(
        "Блинчик", R.string.blinchik_desc, {
                                           AsyncImage(model = "https://images.unsplash.com/photo-1554520735-0a6b8b6ce8b7?q=80&w=3098&auto=format&fit=crop&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D", contentDescription = "Blinchik image", modifier = Modifier.fillMaxWidth().height(120.dp), contentScale = ContentScale.FillBounds)
        }, R.drawable.ic_blinchik
    ), RecipeDTO(
        "Борщ", R.string.borsch_desc, {
                                      AsyncImage(model = "https://images.unsplash.com/photo-1677889173479-c8a0ab15ae18?q=80&w=3270&auto=format&fit=crop&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D", contentDescription = "Borsch image", modifier = Modifier.fillMaxWidth().height(120.dp), contentScale = ContentScale.Fit)
        }, R.drawable.ic_borsch
    ), RecipeDTO(
        "Спагетти", R.string.spagetti_desc, {
                                            AsyncImage(model = "https://images.unsplash.com/photo-1556761223-4c4282c73f77?q=80&w=3165&auto=format&fit=crop&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D", contentDescription = "Spaghetti image", modifier = Modifier.fillMaxWidth().height(120.dp), contentScale = ContentScale.Fit)
        }, R.drawable.ic_spagetti
    ), RecipeDTO(
        "Милкшейк", R.string.milkshake_desc, { 
                                             AsyncImage(model = "https://images.unsplash.com/photo-1577805947697-89e18249d767?q=80&w=3098&auto=format&fit=crop&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D", contentDescription = "Milkshake image", modifier = Modifier.fillMaxWidth().height(120.dp), contentScale = ContentScale.Fit)
        }, R.drawable.ic_milkshake
    ), RecipeDTO(
        "Цезарь", R.string.cesar_desc, {
                                       AsyncImage(model = "https://images.unsplash.com/photo-1550304943-4f24f54ddde9?q=80&w=3270&auto=format&fit=crop&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D", contentDescription = "Caesar image", modifier = Modifier.fillMaxWidth().height(120.dp), contentScale = ContentScale.Fit)
        }, R.drawable.ic_cesar
    )
)