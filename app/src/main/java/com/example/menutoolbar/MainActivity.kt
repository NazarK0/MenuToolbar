package com.example.menutoolbar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import com.example.menutoolbar.databinding.ActivityMainBinding
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar?.apply {
            setDisplayHomeAsUpEnabled(true)
            title = "Admin"
        }
        binding.apply {
            bNav.selectedItemId = R.id.run
            bNav.setOnItemSelectedListener {
                when (it.itemId) {
                    R.id.eco -> onEcoHandler()
                    R.id.extensions -> onExtensionsHandler()
                    R.id.run -> onRunHandler()
                    R.id.format -> onFormatHandler()
                }

                true
            }
        }
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.main_menu, menu)
        return true
    }

    // menu items handler
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            android.R.id.home -> finish()
            R.id.delete -> onDeleteHandler()
            R.id.save -> onSaveHandler()
            R.id.search -> onSearchHandler()
            R.id.sync -> onSyncHandler()
        }


        return true
    }

    private fun onSyncHandler() {
        Toast
            .makeText(this, "Sync", Toast.LENGTH_LONG)
            .show()
    }

    private fun onSearchHandler() {
        Toast
            .makeText(this, "Search", Toast.LENGTH_SHORT)
            .show()
    }

    private fun onSaveHandler() {
        Toast
            .makeText(this, "Save", Toast.LENGTH_LONG)
            .show()
    }

    private fun onDeleteHandler() {
        Toast
            .makeText(this, "Delete", Toast.LENGTH_LONG)
            .show()
    }

    private fun onFormatHandler() {
        Toast
            .makeText(this, "Format", Toast.LENGTH_SHORT)
            .show()
    }

    private fun onRunHandler() {
        Toast
            .makeText(this, "Run", Toast.LENGTH_SHORT)
            .show()
    }

    private fun onExtensionsHandler() {
        Toast
            .makeText(this, "Extensions", Toast.LENGTH_SHORT)
            .show()
    }

    private fun onEcoHandler() {
        Toast
            .makeText(this, "Eco", Toast.LENGTH_SHORT)
            .show()
    }



}