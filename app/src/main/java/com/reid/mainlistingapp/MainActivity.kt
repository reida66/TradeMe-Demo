package com.reid.mainlistingapp

import android.os.Bundle
import android.widget.ImageView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.reid.mainlistingapp.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val navView: BottomNavigationView = binding.navView

        val navController = findNavController(R.id.nav_host_fragment_activity_main)
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        val appBarConfiguration = AppBarConfiguration(
            setOf(
                R.id.navigation_home, R.id.navigation_dashboard, R.id.navigation_notifications
            )
        )
        val searchImage: ImageView = binding.search
        val cartImage: ImageView = binding.cart
        searchImage.setOnClickListener {
            Toast.makeText(
                this,
                "Hello There, Search to be implemented",
                Toast.LENGTH_SHORT
            ).show()
        }
        cartImage.setOnClickListener {
            Toast.makeText(
                this,
                "Hello There, Cart to be implemented",
                Toast.LENGTH_SHORT
            ).show()
        }


        val mainToolBar: androidx.appcompat.widget.Toolbar = binding.toolbar
        setSupportActionBar(mainToolBar)
        setupActionBarWithNavController(navController, appBarConfiguration)
        navView.setupWithNavController(navController)

    }

}