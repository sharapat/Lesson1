package uz.texnopos.androidlesson1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.core.view.isVisible
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.example.*
import java.util.*
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    lateinit var settings: Settings

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        settings = Settings(this)
        button.setOnClickListener {
            settings.name = editText.text.toString()
            settings.score = etScore.text.toString().toInt()
            startActivity(Intent(this, SecondActivity::class.java))
        }
    }
}
