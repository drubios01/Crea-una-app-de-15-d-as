package com.example.appde15dias.ui

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.material3.Card
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.appde15dias.R
import com.example.appde15dias.data.videogames
import com.example.appde15dias.ui.theme.AppDe15DiasTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AppDe15DiasTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize()
                ) {
                    VideogameApp()
                }
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun VideogameApp() {
    Scaffold(
        topBar = {
            VideogameTopAppBar()
        }
    ) { paddingValues ->
        LazyVerticalGrid(
            columns = GridCells.Adaptive(150.dp), // Ajusta el tamaño de las celdas según tus necesidades
            contentPadding = paddingValues
        ) {
            items(videogames) { videogame ->
                VideogameItem(
                    videogame = videogame,
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(375.dp)
                        .padding(dimensionResource(id = R.dimen.padding_small))
                )
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun VideogameTopAppBar(modifier: Modifier = Modifier) {
    CenterAlignedTopAppBar(
        title = {
            Row(
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier.padding(horizontal = 16.dp)
            ) {
                Image(
                    painter = painterResource(id = R.drawable.ic_videogame_logo),
                    contentDescription = null,
                    modifier = Modifier.size(50.dp)
                )
                Spacer(modifier = Modifier.width(8.dp))
                Text(
                    text = stringResource(id = R.string.title),
                    style = MaterialTheme.typography.titleLarge,
                    maxLines = 1,
                    overflow = TextOverflow.Ellipsis
                )
            }
        },
        modifier = modifier
    )
}

@SuppressLint("ResourceType")
@Composable
fun VideogameItem(
    videogame: com.example.appde15dias.data.Videogame,
    modifier: Modifier = Modifier
) {
    Card(
        modifier = modifier
            .clip(MaterialTheme.shapes.medium)
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize() // Asegura que todos los elementos dentro de la celda ocupen todo el espacio disponible
                .padding(dimensionResource(R.dimen.padding_small))
        ) {
            VideogameInformation(
                videogame.name,
                videogame.description,
                videogame.day,
                videogame.imageResourceId
            )
        }
    }
}

@Composable
fun VideogameIcon(
    @DrawableRes videogameIcon: Int,
    modifier: Modifier = Modifier
) {
    Image(
        painter = painterResource(videogameIcon),
        contentDescription = null,
        modifier = modifier
            .padding(dimensionResource(R.dimen.padding_small))
            .clip(MaterialTheme.shapes.small),
        contentScale = ContentScale.Crop
    )
}

@SuppressLint("ResourceType")
@Composable
fun VideogameInformation(
    @StringRes videogameName: Int,
    @StringRes videogameDescriptor: Int,
    @StringRes videogameDay: Int,
    @StringRes videogameImage: Int,
    modifier: Modifier = Modifier
) {
    Text(
        text = stringResource(videogameDay),
        style = MaterialTheme.typography.bodyMedium,
        modifier = Modifier.padding(bottom = 8.dp)
    )

    // Título
    Text(
        text = stringResource(videogameName),
        style = MaterialTheme.typography.titleMedium,
        modifier = Modifier
            .padding(bottom = 8.dp)
            .fillMaxWidth(),
        textAlign = TextAlign.Center
    )

    // Imagen
    VideogameIcon(
        videogameIcon = videogameImage,
        modifier = Modifier
            .fillMaxWidth()
            .height(100.dp)
    )

    // Descripción
    Text(
        text = stringResource(videogameDescriptor),
        style = MaterialTheme.typography.bodyMedium,
        modifier = Modifier
            .padding(top = 8.dp)
            .fillMaxWidth()
    )
}

@Preview
@Composable
fun Preview() {
    AppDe15DiasTheme(darkTheme = false) {
        VideogameApp()
    }
}

@Preview
@Composable
fun DarkPreview() {
    AppDe15DiasTheme(darkTheme = true) {
        VideogameApp()
    }
}
