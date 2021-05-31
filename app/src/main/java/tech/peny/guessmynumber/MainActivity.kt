package tech.peny.guessmynumber

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    var number : Int = 5;

    lateinit var questionTextView : TextView
    lateinit var resultTextView: TextView



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        questionTextView = findViewById(R.id.question_text_view)
        printQuestion()

        resultTextView = findViewById(R.id.result_text_view)

    }

    fun clickDownwardArrow(view : View){
        if(number == 5){
          guessTheNumber(3)

        }else if(number == 3){
            guessTheNumber(2)

        }else if(number == 2){
            guessTheNumber(1)

        }else if(number == 8){
            guessTheNumber(7)
        }else if(number == 7){
            guessTheNumber(6)
        }
    }


    private fun clickUpwardArrow(view : View){
        if (number == 3){
            guessTheNumber(4)
        }else if(number == 5){
            guessTheNumber(8)
        }else if (number == 8){
            guessTheNumber(9)
        }else if (number == 9){
            guessTheNumber(10)
        }
    }

    private fun clickSuccess(view : View){
        questionTextView.visibility  = View.INVISIBLE
        resultTextView.visibility = View.VISIBLE
        resultTextView.text = String.format(resources.getString(R.string.str_success), number)

    }

    private fun clickResetButton(view : View){
        resultTextView.visibility = View.INVISIBLE
        questionTextView.visibility = View.VISIBLE
        number = 5
        printQuestion()

    }

    private fun printQuestion(){
        questionTextView.text = String.format(resources.getString(R.string.str_question), number)
    }

    fun guessTheNumber(myNumber : Int){
        number = myNumber
        printQuestion()
    }
}