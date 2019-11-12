package goodguygregory.app.musictrainer

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import java.util.*

class MainActivity : AppCompatActivity() {

//    Declare Variables
    private var generateProgressionButton: Button? = null
    private var keySignatureValue: TextView? = null
    private var progressionTextView: TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        Assign View Items from the Layout file to the Corresponding Variables

//       key signature values for the user
        keySignatureValue = findViewById(R.id.keySignatureValue)

//      values for the chord progression
        progressionTextView = findViewById(R.id.progressionTextView)

//      generates another Progression for the user
        generateProgressionButton = findViewById(R.id.generateProgressionButton)


        val keySignatures = arrayOf(
            "C","G","F","D", "Bflat"
        )

//      easyProgressions
        val easyChords = arrayOf(
            "V - i",
            "i - iv - V - i",
            "V - I",
            "I - I - V -IV",
            "I - IV - V -I",
            "ii - V7 - I - I",
            "vi - V -I - IV",
            "I - vi - IV -V"
        )
//        mediumProgressions
        val mediumChords = arrayOf(
            "I - iv - V7 - I",
            "I - I - V -V -I6 - IV - V7 - I",
            "I - V - V7 - I I6 - IV - V7 - I",
            "I - III7 - IV - V7",
            "i - VI - iv - vii*",
            "I - V - vi - iii - IV - I - ii6/5 - V7",
            "i - iv - V - i - IV - ii*6 - V - i",
            "I - IV - V - I - vi - ii6 - V - I",
            "I - IV - V - I - vi - ii6 - V - I",
            "i - V - VI - III - iv - i - ii6/5 - V7",
            "i - V - V7 - i i6 - iv - V7 - i",
            "i - VI - III - vii*",
            "I - IV - V - V7 - I - IV - V7 - I",
            "bVI - bIII - bVIII - IV - I - I - I - I",
            "ii* - V7 - i - i",
            "i - iv - VII - III - VI - ii* - V - i",
            "I - vi - ii - V7"
        )

//        hardProgressions
//        val hardChords = arrayOf()

        generateProgressionButton!!.setOnClickListener {

//       generates random new key signatures
            val easyKeyGenerator = Random()

            val randomEasy = easyKeyGenerator.nextInt(5)

            val easyKey = keySignatures[randomEasy]

//            update the screen with new Key
            keySignatureValue!!.text = easyKey

//       generates random progression
            val easyProgressionGenerator = Random()

//            generate random progression
            val randomEasyProg = easyProgressionGenerator.nextInt(easyChords.size)

            val easyProg = easyChords[randomEasyProg]

            progressionTextView!!.text = easyProg


        }
    }
}
