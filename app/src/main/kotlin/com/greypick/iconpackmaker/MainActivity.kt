package com.greypick.iconpackmaker.ui

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import com.google.android.material.button.MaterialButton
import com.greypick.iconpackmaker.R
import com.greypick.iconpackmaker.viewmodel.IconPackViewModel

class MainActivity : AppCompatActivity() {
    
    private lateinit var viewModel: IconPackViewModel
    private lateinit var btnImportImages: MaterialButton
    private lateinit var btnImportZip: MaterialButton
    private lateinit var btnEditIcons: MaterialButton
    private lateinit var btnPreview: MaterialButton
    private lateinit var btnMetadata: MaterialButton
    private lateinit var btnExport: MaterialButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        
        viewModel = ViewModelProvider(this).get(IconPackViewModel::class.java)
        
        setupUI()
        setupClickListeners()
    }

    private fun setupUI() {
        btnImportImages = findViewById(R.id.btn_import_images)
        btnImportZip = findViewById(R.id.btn_import_zip)
        btnEditIcons = findViewById(R.id.btn_edit_icons)
        btnPreview = findViewById(R.id.btn_preview)
        btnMetadata = findViewById(R.id.btn_metadata)
        btnExport = findViewById(R.id.btn_export)
    }

    private fun setupClickListeners() {
        btnImportImages.setOnClickListener {
            viewModel.importImages(this)
        }
        
        btnImportZip.setOnClickListener {
            viewModel.importZip(this)
        }
        
        btnEditIcons.setOnClickListener {
            startActivity(Intent(this, EditIconActivity::class.java))
        }
        
        btnPreview.setOnClickListener {
            startActivity(Intent(this, PreviewActivity::class.java))
        }
        
        btnMetadata.setOnClickListener {
            // Handle metadata
        }
        
        btnExport.setOnClickListener {
            startActivity(Intent(this, ExportActivity::class.java))
        }
    }
}