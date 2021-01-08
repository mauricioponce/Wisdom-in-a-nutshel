 package cl.eme.wisdominnutshell

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.activity.viewModels
import cl.eme.wisdominnutshell.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private val myViewModel: WisdomViewModel by viewModels()

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.reload.setOnClickListener {
            myViewModel.getQuote()
        }

        myViewModel.quote().observe(this, {
            binding.quote.text = it.quote
            binding.author.text = it.author
        })

        myViewModel.getQuote()

    }

    private fun showMessage() {
        Log.d("MainActivity", "ohhh que paso")
        Toast.makeText(this, "MENSAJE", Toast.LENGTH_LONG).show()
    }
}