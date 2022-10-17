package com.example.android_bottom_navigation_view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val bottom_navigation_view = findViewById<BottomNavigationView>(R.id.bottom_navigation_view)

        bottom_navigation_view.setOnItemSelectedListener { menuItem ->
            when(menuItem.itemId) {
                R.id.action_music -> {
                    goToFragment(MusicFragment())
                    true
                }
                R.id.action_films -> {
                    goToFragment(FilmsFragment())
                    true
                }
                R.id.action_books -> {
                    goToFragment(BooksFragment())
                    true
                }
                else -> false
            }
        }
        bottom_navigation_view.selectedItemId = R.id.action_music
    }

    fun goToFragment(fragment: Fragment) {
        supportFragmentManager.beginTransaction().replace(R.id.main_container, fragment).commit()
    }

    // childFragmentmanager.beginTransaction().replace(R.id.main_container, f).commit()
    // Fragment
}