package goodguygregory.app.musictrainer

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.EditText
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import com.google.firebase.auth.FirebaseAuth

//Debugging Logs
private const val TAG = "MainActivity"

class SignupActivity : AppCompatActivity() {

//    Adds variables for signup
    private lateinit var userEmail: EditText
    private lateinit var userPassword: EditText
    private lateinit var signUp: Button
    private lateinit var loginSwitch: TextView

    private lateinit var auth: FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup)

//        login Creds:
        userEmail = findViewById(R.id.prompt_email)
        userPassword = findViewById(R.id.prompt_password)

//      Buttons:
        signUp = findViewById(R.id.action_signup)
        loginSwitch = findViewById(R.id.already_user_login)

//        Authenticate Users with Firebase inside of the Project:
        auth = FirebaseAuth.getInstance()

        signUp.setOnClickListener {
           registerUser()
        }



        loginSwitch.setOnClickListener {
//            Start LoginActivity:
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
        }

    }

    private fun registerUser() {
        val email = userEmail.text.toString()
        val password = userPassword.text.toString()

//            Handle Errors from User
        if (email.isEmpty() || password.isEmpty()) {
            Toast.makeText(this, "Please Enter an Email, and Password to Begin Jamming!", Toast.LENGTH_LONG).show()
            return
        }

//            Tests:
        Log.d("SignUpActivity", "Email is: " + email)
        Log.d("SignUpActivity", "Password is: " + password)

        auth.createUserWithEmailAndPassword(email, password)
            .addOnCompleteListener(this) { task ->
                if (task.isSuccessful) {
                    // Sign in success, update UI with the signed-in user's information
                    Log.d(TAG, "createUserWithEmail:success")

                    Toast.makeText(baseContext, "Let's Jam!.",
                        Toast.LENGTH_SHORT).show()
                    val intent = Intent(this, HomeActivity::class.java)
                    startActivity(intent)

                } else {
                    // If sign in fails, display a message to the user.
                    Log.w(TAG, "createUserWithEmail:failure", task.exception)
                    Toast.makeText(baseContext, "Authentication failed.",
                        Toast.LENGTH_SHORT).show()

                }
            }

    }
}
