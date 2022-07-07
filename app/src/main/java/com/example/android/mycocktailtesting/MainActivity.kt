package com.example.android.mycocktailtesting

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.appcompat.app.AppCompatDelegate
import androidx.navigation.NavController
import androidx.navigation.NavDestination
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.fragment.findNavController
import androidx.navigation.ui.NavigationUI.navigateUp
import androidx.navigation.ui.NavigationUI.setupWithNavController
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.example.android.mycocktailtesting.databinding.ActivityMainBinding
import com.google.android.material.floatingactionbutton.FloatingActionButton

private lateinit var binding: ActivityMainBinding
private lateinit var navController: NavController
private lateinit var floatingActionButton: FloatingActionButton


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        binding = ActivityMainBinding.inflate(layoutInflater)

        binding?.apply {
            setContentView(root)
            setSupportActionBar(toolbar)

            navController = (supportFragmentManager
                .findFragmentById(R.id.nav_host_fragment) as NavHostFragment)
                .navController
            setupWithNavController(bottomNavigationView, navController)

            floatingActionButton = fabAddLog
            floatingActionButton.setOnClickListener(View.OnClickListener {
                navController.navigate(R.id.addLogFragment)
            })

        }
        navController.addOnDestinationChangedListener { _, destination: NavDestination, _ ->
            val toolBar = supportActionBar ?: return@addOnDestinationChangedListener
            when(destination.id) {
                R.id.addLogFragment -> {
                    toolBar.setDisplayShowTitleEnabled(false)
                    toolBar.setDisplayHomeAsUpEnabled(true)
                    floatingActionButton.visibility = View.GONE
                    binding.heroImage.visibility = View.VISIBLE
                    binding.bottomNavigationView.visibility = View.GONE
                }
                R.id.detailFragment -> {
                    toolBar.setDisplayShowTitleEnabled(false)
                    toolBar.setDisplayHomeAsUpEnabled(true)
                    floatingActionButton.visibility = View.VISIBLE
                    binding.heroImage.visibility = View.VISIBLE
                    binding.bottomNavigationView.visibility = View.GONE
                }
                else -> {
                    toolBar.setDisplayShowTitleEnabled(true)
                    toolBar.setDisplayHomeAsUpEnabled(false)
                    floatingActionButton.visibility = View.VISIBLE
                    binding.heroImage.visibility = View.VISIBLE
                    binding.bottomNavigationView.visibility = View.VISIBLE
                }
            }
        }
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }

}
