package com.bohdanov.uilibrary.temp

import com.bohdanov.uilibrary.ui.models.Movie
import com.bohdanov.uilibrary.ui.models.Section

fun getCatalog(): List<Section> {
    return listOf(
        Section(
            title = "Action",
            movies = listOf(
                Movie(name = "The Dark Knight"),
                Movie(name = "Mad Max: Fury Road"),
                Movie(name = "Inception"),
                Movie(name = "The Matrix"),
                Movie(name = "John Wick"),
            )
        ),
        Section(
            title = "Adventure",
            movies = listOf(
                Movie(name = "The Lord of the Rings: The Return of the King"),
                Movie(name = "The Shawshank Redemption"),
                Movie(name = "The Princess Bride"),
                Movie(name = "The Godfather"),
                Movie(name = "The Good, the Bad and the Ugly"),
            )
        ),
        Section(
            title = "Comedy",
            movies = listOf(
                Movie(name = "The Big Lebowski"),
                Movie(name = "Airplane!"),
                Movie(name = "The Hangover"),
                Movie(name = "Blazing Saddles"),
                Movie(name = "Monty Python and the Holy Grail"),
            )
        ),
        Section(
            title = "Drama",
            movies = listOf(
                Movie(name = "The Shawshank Redemption"),
                Movie(name = "The Godfather"),
                Movie(name = "Schindler's List"),
                Movie(name = "The Pianist"),
                Movie(name = "Titanic"),
            )
        ),
        Section(
            title = "Horror",
            movies = listOf(
                Movie(name = "The Conjuring"),
                Movie(name = "The Exorcist"),
                Movie(name = "The Shining"),
                Movie(name = "Alien"),
                Movie(name = "Jaws"),
            )
        ),
    )
}

