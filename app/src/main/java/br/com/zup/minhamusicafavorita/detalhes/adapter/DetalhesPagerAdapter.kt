package br.com.zup.minhamusicafavorita.detalhes.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter

//pager adapter sempre que tiver um viewpager, adapter sempre que tiver um recyclerview
class DetalhesPagerAdapter(
    fragmentManager: FragmentManager,
    lifecycle: Lifecycle,
    //guias do meu tabLayout
    private var listaTitulos: List<String>,
) : FragmentStateAdapter(fragmentManager, lifecycle) {

    override fun getItemCount(): Int = listaTitulos.size

    //sempre que usar viewpager, tem que usar fragmentos junto
    override fun createFragment(position: Int): Fragment {
        TODO("Not yet implemented")
    }
}