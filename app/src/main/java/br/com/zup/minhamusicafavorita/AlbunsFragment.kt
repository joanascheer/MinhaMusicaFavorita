package br.com.zup.minhamusicafavorita

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.GridLayout
import androidx.core.os.bundleOf
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import br.com.zup.minhamusicafavorita.databinding.FragmentAlbunsBinding
import br.com.zup.minhamusicafavorita.detalheAlbum.AlbumAdapter
import br.com.zup.minhamusicafavorita.model.Album

class AlbunsFragment : Fragment() {
    private lateinit var binding: FragmentAlbunsBinding

    private val albumAdapter: AlbumAdapter by lazy {
        AlbumAdapter(arrayListOf())
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentAlbunsBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        adicionarItemListaAlbuns()
    }

    private fun exibirRecyclerView() {
        //adicionarItemListaAlbuns()
        binding.rvListaAlbuns.adapter = albumAdapter
        binding.rvListaAlbuns.layoutManager = GridLayoutManager(context, 2)
    }

    private fun adicionarItemListaAlbuns(): MutableList<Album> {
        val listaAlbuns = mutableListOf<Album>()

        listaAlbuns.add(
            Album(
                R.drawable.parachutes,
                "Coldplay",
                2000,
                "Capitol",
                "Parlophone",
                "CD, Cassete",
                "Rock Alternativo",
                "Parachutes é o álbum de estreia da banda inglesa de rock Coldplay, lançado pela gravadora Parlophone em 10 de julho de 2000 no Reino Unido. O álbum foi produzido pela própria banda e pelo produtor britânico Ken Nelson, com exceção de uma faixa que foi produzido por Chris Allison. Parachutes gerou quatro singles de sucesso \"Shiver\", \"Yellow\", \"Trouble\" e \"Don't Panic\".",
                "Parachutes"
            )
        )

        listaAlbuns.add(
            Album(
                R.drawable.rush_of_blood,
                "Coldplay",
                2002,
                "Capitol",
                "Parlophone",
                "CD, Cassete",
                "Rock Alternativo",
                "Desc",
                "Rush of Blood"
            )
        )

        listaAlbuns.add(
            Album(
                R.drawable.xy,
                "Coldplay",
                2004,
                "Capitol",
                "Parlophone",
                "CD, Cassete",
                "Rock Alternativo",
                "Desc",
                "X & Y"
            )
        )

        listaAlbuns.add(
            Album(
                R.drawable.viva_la_vida,
                "Coldplay",
                2007,
                "Parlophone",
                "Parlophone",
                "CD, Cassete",
                "Rock Alternativo",
                "Desc",
                "Viva la Vida"
            )
        )

        listaAlbuns.add(
            Album(
                R.drawable.myloxyloto,
                "Coldplay",
                2009,
                "Parlophone",
                "Parlophone",
                "CD, Cassete",
                "Rock Alternativo",
                "Desc",
                "Myloxyloto"
            )
        )

        listaAlbuns.add(
            Album(
                R.drawable.ghost_stories,
                "Coldplay",
                2012,
                "Atlantic",
                "Parlophone",
                "CD, Cassete",
                "Rock Alternativo",
                "Desc",
                "Ghost Stories"
            )
        )

        exibirRecyclerView()
        return listaAlbuns
    }

    private fun irParaDetalheAlbum(album: Album) {

        //val navControler = findNavController()
        //navControler.navigate(R.id.action_albunsFragment_to_detalheAlbumFragment)
        val bundle = bundleOf(CHAVE_ALBUM to album)

        NavHostFragment.findNavController(this).navigate(
            R.id.action_albunsFragment_to_detalheAlbumFragment, bundle
        )

    }

}