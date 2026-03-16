package com.greypick.iconpackmaker.viewmodel

import android.content.Context
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.greypick.iconpackmaker.model.Icon
import com.greypick.iconpackmaker.model.IconPackMetadata
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class IconPackViewModel : ViewModel() {
    
    private val _icons = MutableLiveData<List<Icon>>(emptyList())
    val icons: LiveData<List<Icon>> = _icons
    
    private val _metadata = MutableLiveData<IconPackMetadata>()
    val metadata: LiveData<IconPackMetadata> = _metadata
    
    fun importImages(context: Context) {
        // Implementasi import gambar
    }
    
    fun importZip(context: Context) {
        // Implementasi import ZIP
    }
    
    fun addIcon(icon: Icon) {
        val currentList = _icons.value?.toMutableList() ?: mutableListOf()
        currentList.add(icon)
        _icons.value = currentList
    }
    
    fun removeIcon(iconId: String) {
        val currentList = _icons.value?.toMutableList() ?: mutableListOf()
        currentList.removeAll { it.id == iconId }
        _icons.value = currentList
    }
    
    fun updateMetadata(newMetadata: IconPackMetadata) {
        _metadata.value = newMetadata
    }
}
