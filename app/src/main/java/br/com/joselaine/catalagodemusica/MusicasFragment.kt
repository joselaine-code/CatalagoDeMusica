package br.com.joselaine.catalagodemusica

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.RecyclerView
import br.com.joselaine.catalagodemusica.databinding.FragmentMusicasBinding
import br.com.joselaine.catalagodemusica.recycler.adapter.MusicaAdapter
import br.com.joselaine.catalagodemusica.recycler.model.Musicas

class MusicasFragment : Fragment() {
    private var binding: FragmentMusicasBinding? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentMusicasBinding.inflate(inflater, container, false)
        return binding?.root

    }

    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }
}