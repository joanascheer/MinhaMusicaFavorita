package br.com.zup.minhamusicafavorita.detalhes

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import br.com.zup.minhamusicafavorita.R
import br.com.zup.minhamusicafavorita.databinding.ActivityDetalhesBinding
import br.com.zup.minhamusicafavorita.detalhes.adapter.DetalhesPagerAdapter
import com.google.android.material.tabs.TabLayoutMediator

class DetalhesActivity : AppCompatActivity() {
    private lateinit var binding: ActivityDetalhesBinding
    private val listaTitulos = listOf("Informações", "Álbuns")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetalhesBinding.inflate(layoutInflater)
        setContentView(binding.root)

        customAppBar()
        exibirViewPagerTabLayout()

    }

    private fun customAppBar() {
        //back button
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        //titulo que aparece na barra
        supportActionBar?.title = "Minha música Favorita"
    }

    private fun exibirViewPagerTabLayout() {
        val detalhesPagerAdapter = DetalhesPagerAdapter(supportFragmentManager, lifecycle, listaTitulos)
        binding.vpDetalhes.adapter = detalhesPagerAdapter

        //configura os titulos que serao exibidos e a conexao com o viewpager
        TabLayoutMediator(binding.tlDetalhes, binding.vpDetalhes) { tab, position ->
            tab.text = listaTitulos[position]
        }.attach()
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (item.itemId == android.R.id.home) {
            this.finish()
            return true
        }
        return super.onOptionsItemSelected(item)
    }
}