package com.greypick.iconpackmaker.util

import android.content.Context
import java.io.File

object FileUtil {
    
    fun getIconsDirectory(context: Context): File {
        val dir = File(context.cacheDir, "icons")
        if (!dir.exists()) {
            dir.mkdirs()
        }
        return dir
    }
    
    fun getMetadataDirectory(context: Context): File {
        val dir = File(context.cacheDir, "metadata")
        if (!dir.exists()) {
            dir.mkdirs()
        }
        return dir
    }
    
    fun deleteDirectory(file: File): Boolean {
        return if (file.isDirectory) {
            file.listFiles()?.forEach { deleteDirectory(it) }
            file.delete()
        } else {
            file.delete()
        }
    }
}
