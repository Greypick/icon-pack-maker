package com.greypick.iconpackmaker.model

data class IconPackMetadata(
    val appName: String,
    val author: String,
    val version: String,
    val packageName: String,
    val description: String = "",
    val icons: List<Icon> = emptyList()
)
