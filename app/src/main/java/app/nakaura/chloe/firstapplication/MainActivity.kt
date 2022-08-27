package app.nakaura.chloe.firstapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import app.nakaura.chloe.firstapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater).apply{ setContentView(this.root)}
        binding.changeTextButton.setOnClickListener{
            binding.textView.text = "I'm Chloe!"
            binding.changeTextButton.text = "Change the text again"
        }
    }
}