package com.bohdanov.uilibrary.ui.models

import java.util.UUID

data class Movie(
    val id: String = UUID.randomUUID().toString(),
    val name: String,
    val posterLink: String = "https://loremflickr.com/600/600"
)