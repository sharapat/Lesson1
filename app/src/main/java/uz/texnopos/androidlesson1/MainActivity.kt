package uz.texnopos.androidlesson1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.core.view.isVisible
import kotlinx.android.synthetic.main.example.*
import java.util.*
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.example)
        var input = Scanner(System.`in`)
        var a = listOf(10,9,8,7,6,5,4,3,2,1,-1,-2,-3,-4,-5,-6,-7,-8,-9,-10)
        a.shuffled()
        var b = arrayListOf('+','-','/','*')
        b.shuffle()
        var c = Random.nextInt(-100,100)
        var d = Random.nextInt(-100,100)
        textview1.text = c.toString()
        textview2.text = d.toString()
        textview3.text = b[0].toString()
    }
}
