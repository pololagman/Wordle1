package com.example.wordle



import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.wordle.FourLetterWordList.fourLetterWords
import com.example.wordle.FourLetterWordList.getRandomFourLetterWord
import org.w3c.dom.Text
import java.util.*


class MainActivity : AppCompatActivity() {


var counter = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val button = findViewById<Button>(R.id.button)
        var wordGuess = findViewById<EditText>(R.id.wordGuess)
        val wordDisplay1:TextView = findViewById((R.id.textView))
        val wordDisplay2:TextView = findViewById((R.id.textView10))
        val wordDisplay3: TextView = findViewById(R.id.textView12)
        val correctWord: TextView = findViewById(R.id.textView8)

        button.setOnClickListener {
            counter = counter + 1
            if (counter == 1)
            {val guess1:String = wordGuess.text.toString()
            wordDisplay1.setText(guess1)

            }
            if (counter == 2)
            {val guess2: String = wordGuess.text.toString()
            wordDisplay2.setText(guess2)

            }
            if (counter == 3)
            {val guess3: String = wordGuess.text.toString()
            wordDisplay3.setText(guess3)
                val rightWord: String = getRandomFourLetterWord()
                correctWord.setText(rightWord)
            }
            if(counter>3)
            { Toast.makeText(it.context, "Number of guess exceeded", Toast.LENGTH_SHORT).show()
              button.setEnabled(false)
            }


    }
}







}



