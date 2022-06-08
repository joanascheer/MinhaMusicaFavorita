package br.com.zup.minhamusicafavorita.detalheAlbum

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import br.com.zup.minhamusicafavorita.databinding.AlbunsItemBinding
import br.com.zup.minhamusicafavorita.model.Album

class AlbumAdapter(
    private var listaAlbuns: MutableList<Album>
) : RecyclerView.Adapter<AlbumAdapter.ViewHolder>() {

    //sempre assim
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = AlbunsItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val album = listaAlbuns[position]
        holder.exibirInformacoesView(album)
    }

    override fun getItemCount(): Int {
        return listaAlbuns.size
    }

    fun atualizarLista(novaListaAlbuns: MutableList<Album>){
        if (listaAlbuns.size == 0){
            listaAlbuns = novaListaAlbuns
        }else{
            listaAlbuns.addAll(novaListaAlbuns)
        }

        notifyDataSetChanged()
    }

    class ViewHolder(val binding: AlbunsItemBinding) : RecyclerView.ViewHolder(binding.root) {
        fun exibirInformacoesView(album: Album) {
            binding.ivImagemAlbum.setImageResource(album.getFoto())
        }
    }
}