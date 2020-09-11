package app.babachan.curryandrice

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import java.lang.Math.random
import java.util.*
import kotlin.random.Random.Default.nextInt

class MainActivity : AppCompatActivity() {

    val people = arrayOf<String>("シンデレラ", "ジャスミン", "ラプンツェル", "パスカル")
    val food = arrayOf<String>("ケーキ", "パフェ", "スコーン", "サンドイッチ", "バター")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun savedFood(view: View?) {
        val randomName = random()
        val index = Random.nextInt(4)
        val name = people[index.nextInt()]
        nameTextView.text = name + "に"

        foodTextView.text = food[Random().nextInt(4)] + "を"

        if (Random().nextInt(100) < 50) {
            verbTextView.text = "よそえました^^"
            verbTextView.textSize = 18F
        } else {
            verbTextView.text = "よそえませんでした"
            verbTextView.textSize = 24F
        }
    }
}