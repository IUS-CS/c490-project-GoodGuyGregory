package goodguygregory.app.musictrainer

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.core.content.ContextCompat
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

private const val TAG ="MainActivity"

class MainActivity : AppCompatActivity() {


    private val progressions = Progressions()


    //    Declare Variables
    private var generateProgressionButton: Button? = null
    private var keySignatureValue: TextView? = null
    private var progressionTextView: TextView? = null
    private lateinit var difficultyRating: TextView

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

        difficultyRating = findViewById(R.id.diff)

//        Set Difficulty:
        val diff = intent.getStringExtra("EXTRA_DIFF")

//        Set Value for the UI:
        difficultyRating.setText("${diff} Progressions")


        when (diff) {
            "Easy" -> {
                keySignatureValue!!.text = progressions.getEasyKey()
                progressionTextView!!.text = progressions.getEasyProgression()
            }
            "Medium" -> {
                keySignatureValue!!.text = progressions.getMedKey()
                progressionTextView!!.text = progressions.getMedProgression()
            }
            "Hard" -> {
                keySignatureValue!!.text = progressions.getHardKey()
                progressionTextView!!.text = progressions.getHardProgression()
            }
            else -> {
                Toast.makeText(
                baseContext, "Something Went Wrong!",
                Toast.LENGTH_SHORT
            ).show()
            }
        }
        //        Confirm Values of diff
//        Log.d(TAG, "Diff: $diff")

        fun checkDiff() {
            when (diff) {
                "Easy" -> {
                    keySignatureValue!!.text = progressions.getEasyKey()
                    progressionTextView!!.text = progressions.getEasyProgression()

                }
                "Medium" -> {
                    keySignatureValue!!.text = progressions.getMedKey()
                    progressionTextView!!.text = progressions.getMedProgression()
                }
                "Hard" -> {
                    keySignatureValue!!.text = progressions.getHardKey()
                    progressionTextView!!.text = progressions.getHardProgression()
                }
                else -> {
                    Toast.makeText(
                    baseContext, "Something Went Wrong!",
                    Toast.LENGTH_SHORT
                    ).show()
                }
            }
        }

            generateProgressionButton!!.setOnClickListener {
                checkDiff()
         }
        }

    }
