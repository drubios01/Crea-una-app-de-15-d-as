package com.example.appde15dias.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Videogame(
    @StringRes val name: Int,
    @StringRes val description: Int,
    @StringRes val day: Int,
    @DrawableRes val imageResourceId: Int
)