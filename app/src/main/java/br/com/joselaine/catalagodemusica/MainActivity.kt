package br.com.joselaine.catalagodemusica

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import br.com.joselaine.catalagodemusica.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        val fragmentsList = listOf(MusicasFragment(), ImagensFragment(), AlbunsFragment())
        val fragmentsTitleList = listOf("Músicas", "Imagens", "Álbuns")

        val viewPagerAdapter = ViewPagerAdapter(
            fragmentManager = supportFragmentManager,
            fragmentsList = fragmentsList,
            fragmentsTitleList = fragmentsTitleList
        )

        with(binding) {
            viewPager.adapter = viewPagerAdapter
            tab.setupWithViewPager(viewPager)
        }
    }
}