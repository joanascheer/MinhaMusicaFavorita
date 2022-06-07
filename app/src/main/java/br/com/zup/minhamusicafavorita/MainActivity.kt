package br.com.zup.minhamusicafavorita

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import br.com.zup.minhamusicafavorita.databinding.ActivityMainBinding
import br.com.zup.minhamusicafavorita.detalhes.DetalhesActivity

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonDetalhes.setOnClickListener {
        val intent = Intent(this,DetalhesActivity::class.java)
            startActivity(intent)
        }
    }
}