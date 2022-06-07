package br.com.zup.minhamusicafavorita.detalhes

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import br.com.zup.minhamusicafavorita.R
import br.com.zup.minhamusicafavorita.databinding.ActivityDetalhesBinding

class DetalhesActivity : AppCompatActivity() {
    private lateinit var binding: ActivityDetalhesBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetalhesBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}