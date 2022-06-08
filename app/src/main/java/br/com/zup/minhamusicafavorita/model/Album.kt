package br.com.zup.minhamusicafavorita.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
class Album(
    private val foto: Int,
    private val artista: String = "Coldplay",
    private val lancamento: Int,
    private val gravadora: String,
    private val estudio: String,
    private val formato: String,
    private val genero: String = "Rock Alternativo",
    private val descricao: String = "Descrição geral",
    private val nome: String,
) : Parcelable {
    fun getFoto() = this.foto
    fun getArtist() = this.artista
    fun getLancamento() = this.lancamento
    fun getGravadora() = this.gravadora
    fun getEstudio() = this.estudio
    fun getFormato() = this.formato
    fun getGenero() = this.genero
    fun getDescricao() = this.descricao
    fun getNomeAlbum() = this.nome
}