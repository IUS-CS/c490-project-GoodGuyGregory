package goodguygregory.app.musictrainer

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Button



class DifficultyActivity : AppCompatActivity() {

//    Creates Variables for the activity:
    private lateinit var practiceTitle: TextView
    private lateinit var easyButton: Button
    private lateinit var medButton: Button
    private lateinit var hardButton: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_difficulty)

//        declare variables for View:
        practiceTitle = findViewById(R.id.diff_title)

        easyButton = findViewById(R.id.easy_button)
        medButton = findViewById(R.id.medium_button)
        hardButton = findViewById(R.id.hard_button)

//        Set Text of the declared items:
        practiceTitle.setText(R.string.diff_title)

        easyButton.setText(R.string.easy_button)
        medButton.setText(R.string.medium_button)
        hardButton.setText(R.string.hard_button)


//        Create OnClick Listeners which will generate the MainActivity
        easyButton.setOnClickListener {
            //            Set intent for the Difficulty Activity
            // TODO: Pass a Value for the MainActivity to implement Code
            val intent = Intent(this, MainActivity::class.java)
            intent.putExtra("EXTRA_DIFF", "Easy")
            startActivity(intent)
        }

        medButton.setOnClickListener {
            //            Set intent for the Difficulty Activity
            // TODO: Pass a Value for the MainActivity to implement Code
            val intent = Intent(this, MainActivity::class.java)
            intent.putExtra("EXTRA_DIFF", "Medium")
            startActivity(intent)
        }

        hardButton.setOnClickListener {
            //            Set intent for the Difficulty Activity
            // TODO: Pass a Value for the MainActivity to implement Code
            val intent = Intent(this, MainActivity::class.java)

            intent.putExtra("EXTRA_DIFF", "Hard")
            startActivity(intent)
        }


    }
}
