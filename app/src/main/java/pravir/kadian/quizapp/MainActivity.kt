package pravir.kadian.quizapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val etName: EditText = findViewById(R.id.et_name)
        val btnStart : Button = findViewById(R.id.btn_start)
        btnStart.setOnClickListener {
            if(etName.text.isNotEmpty()){
                val intent = Intent(this,QuizQuestionsActivity::class.java)
                intent.putExtra(Constants.USER_NAME,etName.text.toString())
                startActivity(intent)
                finish()
            }
            else{
                Toast.makeText(this,"Please Enter Your Name",Toast.LENGTH_LONG).show()
            }
        }
    }
}