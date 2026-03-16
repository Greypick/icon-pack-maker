package com.greypick.iconpackmaker.util

import android.graphics.Bitmap
import android.graphics.BitmapFactory
import java.io.File

object ImageUtil {
    
    fun loadBitmap(imagePath: String): Bitmap? {
        return try {
            BitmapFactory.decodeFile(imagePath)
        } catch (e: Exception) {
            null
        }
    }
    
    fun saveBitmap(bitmap: Bitmap, outputPath: String): Boolean {
        return try {
            File(outputPath).outputStream().use { out ->
                bitmap.compress(Bitmap.CompressFormat.PNG, 100, out)
            }
            true
        } catch (e: Exception) {
            false
        }
    }
    
    fun resizeBitmap(bitmap: Bitmap, width: Int, height: Int): Bitmap {
        return Bitmap.createScaledBitmap(bitmap, width, height, true)
    }
}
