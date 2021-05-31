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
            number = 3;
            printQuestion()
        }else if(number == 3){
            number = 2
            printQuestion()

        }else if(number == 2){
            number = 1
            printQuestion()

        }else if(number == 8){
            number = 7
            printQuestion()
        }else if(number == 7){
            number = 6
            printQuestion()
        }
    }


    fun clickUpwardArrow(view : View){
        if (number == 3){
            number = 4
            printQuestion()
        }else if(number == 5){
            number = 8
            printQuestion()
        }else if (number == 8){
            number = 9
            printQuestion()
        }else if (number == 9){
            number = 10
            printQuestion()
        }
    }

    fun clickSuccess(view : View){
        questionTextView.visibility  = View.INVISIBLE
        resultTextView.visibility = View.VISIBLE
        resultTextView.text = String.format(resources.getString(R.string.str_success), number)

    }

    fun clickResetButton(view : View){
        resultTextView.visibility = View.INVISIBLE
        questionTextView.visibility = View.VISIBLE
        number = 5
        printQuestion()

    }

    fun printQuestion(){
        questionTextView.text = String.format(resources.getString(R.string.str_question), number)
    }
}