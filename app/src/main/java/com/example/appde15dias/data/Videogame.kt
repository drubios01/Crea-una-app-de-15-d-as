package com.example.appde15dias.data

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import com.example.appde15dias.R

data class Videogame(
    @DrawableRes val imageResourceId: Int,
    @StringRes val day: Int,
    @StringRes val name: Int,
    @StringRes val description: Int
)

val videogames = listOf(
    Videogame(R.drawable.the_legend_of_zelda, R.string.dia1, R.string.videogame_name_1, R.string.videogame_description_1),
    Videogame(R.drawable.the_witcher_3_wild_hunt, R.string.dia2, R.string.videogame_name_2, R.string.videogame_description_2),
    Videogame(R.drawable.red_dead_redemption_2, R.string.dia3, R.string.videogame_name_3, R.string.videogame_description_3),
    Videogame(R.drawable.minecraft, R.string.dia4, R.string.videogame_name_4, R.string.videogame_description_4),
    Videogame(R.drawable.overwatch, R.string.dia5, R.string.videogame_name_5, R.string.videogame_description_5),
    Videogame(R.drawable.super_mario_odyssey, R.string.dia6, R.string.videogame_name_6, R.string.videogame_description_6),
    Videogame(R.drawable.fortnite, R.string.dia7, R.string.videogame_name_7, R.string.videogame_description_7),
    Videogame(R.drawable.cyberpunk_2077, R.string.dia8, R.string.videogame_name_8, R.string.videogame_description_8),
    Videogame(R.drawable.god_of_war, R.string.dia9, R.string.videogame_name_9, R.string.videogame_description_9),
    Videogame(R.drawable.horizon_zero_dawn, R.string.dia10, R.string.videogame_name_10, R.string.videogame_description_10),
    Videogame(R.drawable.dark_souls_3, R.string.dia11, R.string.videogame_name_11, R.string.videogame_description_11),
    Videogame(R.drawable.doom_eternal, R.string.dia12, R.string.videogame_name_12, R.string.videogame_description_12),
    Videogame(R.drawable.assassins_creed_valhalla, R.string.dia13, R.string.videogame_name_13, R.string.videogame_description_13),
    Videogame(R.drawable.genshin_impact, R.string.dia14, R.string.videogame_name_14, R.string.videogame_description_14),
    Videogame(R.drawable.titanfall_2, R.string.dia15, R.string.videogame_name_15, R.string.videogame_description_15)
)