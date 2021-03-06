package br.com.zup.minhamusicafavorita.detalheAlbum

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import br.com.zup.minhamusicafavorita.CHAVE_ALBUM
import br.com.zup.minhamusicafavorita.databinding.FragmentDetalheAlbumBinding
import br.com.zup.minhamusicafavorita.model.Album

class DetalheAlbumFragment : Fragment() {

    private lateinit var binding: FragmentDetalheAlbumBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentDetalheAlbumBinding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        recuperarDadosAlbum()
    }

    private fun recuperarDadosAlbum() {
        val album = arguments?.getParcelable<Album>(CHAVE_ALBUM)
        if (album != null) {
            binding.ivCapaAlbumTelaDetalhes.setImageResource(album.getFoto())
            binding.tvNomeAlbumTelaDetalhes.text = album.getNomeAlbum()
            binding.tvDescricaoAlbumTelaDetalhes.text = album.getDescricao()
            binding.tvArtistaAlbumTelaDetalhes.text = album.getArtist()
            binding.tvLancamentoAlbumTelaDetalhes.text = album.getLancamento().toString()
            binding.tvGravadoraAlbumTelaDetalhes.text = album.getGravadora()
            binding.tvEstudioAlbumTelaDetalhes.text = album.getEstudio()
            binding.tvFormatoAlbumTelaDetalhes.text = album.getFormato()
            binding.tvGeneroAlbumTelaDetalhes.text = album.getGenero()

        }
    }

}