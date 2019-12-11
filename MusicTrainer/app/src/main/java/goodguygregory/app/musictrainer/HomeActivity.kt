package goodguygregory.app.musictrainer

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Button

class HomeActivity : AppCompatActivity() {

//    Creates Variables:

    private lateinit var welcomeText: TextView

    private lateinit var messageText: TextView

    private lateinit var beginButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        welcomeText = findViewById(R.id.welcome_text)
        messageText = findViewById(R.id.welcome_message)

        beginButton = findViewById(R.id.begin_button)

        welcomeText.setText(R.string.welcome_text)

        messageText.setText(R.string.welcome_message)

        beginButton.setText(R.string.begin_button)

//        Begin Practice Activity:
        beginButton.setOnClickListener {
//            Set intent for the Difficulty Activity
            val intent = Intent(this, DifficultyActivity::class.java)
            startActivity(intent)
        }

    }
}
