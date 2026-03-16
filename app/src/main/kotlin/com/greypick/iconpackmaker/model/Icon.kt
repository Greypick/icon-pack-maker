package com.greypick.iconpackmaker.model

data class Icon(
    val id: String,
    val name: String,
    val imagePath: String,
    val category: String,
    val width: Int = 192,
    val height: Int = 192
)
