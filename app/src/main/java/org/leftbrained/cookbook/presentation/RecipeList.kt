package org.leftbrained.cookbook.presentation

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.wear.compose.foundation.lazy.ScalingLazyColumn
import androidx.wear.compose.material.Card
import androidx.wear.compose.material.MaterialTheme
import androidx.wear.compose.material.Text
import androidx.wear.compose.navigation.rememberSwipeDismissableNavController

@Composable
fun RecipeList(navController: NavController) {
    ScalingLazyColumn {
        items(main.size) { index ->
            RecipeListItem(navController, main[index])
        }
    }
}

@Composable
fun RecipeListItem(navController: NavController, recipeDTO: RecipeDTO) {
    Card(onClick = { navController.navigate("recipeInfo/${main.indexOf(recipeDTO)}") }) {
        Row(
            Modifier
                .padding(4.dp), verticalAlignment = Alignment.CenterVertically) {
            Image(
                painter = painterResource(recipeDTO.icon),
                contentDescription = "Recipe image",
                modifier = Modifier
                    .size(50.dp)
                    .padding(4.dp)
            )
            Text(
                text = recipeDTO.name,
                modifier = Modifier
                    .padding(4.dp)
            )
        }
    }
}

@Preview(device = "id:wearos_small_round", showSystemUi = true)
@Composable
fun RecipeListPreview() {
    RecipeList(rememberSwipeDismissableNavController())
}
