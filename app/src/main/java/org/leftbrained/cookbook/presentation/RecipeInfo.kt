package org.leftbrained.cookbook.presentation

import androidx.compose.foundation.Image
import androidx.compose.foundation.ScrollState
import androidx.compose.foundation.gestures.Orientation
import androidx.compose.foundation.gestures.scrollable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.wear.compose.foundation.lazy.ScalingLazyColumn
import androidx.wear.compose.foundation.lazy.rememberScalingLazyListState
import androidx.wear.compose.material.Text

@Composable
fun RecipeInfo(recipeDTO: RecipeDTO) {
    val scrollState = rememberScalingLazyListState()
    ScalingLazyColumn(Modifier.fillMaxSize(), scrollState) {
        item {
            Column {
                recipeDTO.image()
                Text(text = recipeDTO.name, Modifier.padding(24.dp))
                Text(text = stringResource(recipeDTO.description), Modifier.padding(24.dp))
            }
        }
    }
}

@Composable
@Preview(device = "spec:width=384px,height=384px,dpi=320,isRound=true", showSystemUi = false,
    showBackground = true
)
fun RecipeInfoPreview() {
    RecipeInfo(main[0])
}