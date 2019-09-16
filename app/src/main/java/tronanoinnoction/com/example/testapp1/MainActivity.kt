package tronanoinnoction.com.example.testapp1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*



class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn1.setOnClickListener {
         Log.i("MainActivity", "Button was clicked")

         Toast.makeText(this,"Button was clicked",Toast.LENGTH_SHORT).show()
        }

        btn2.setOnClickListener {
            val message : String = Usermsg.text.toString()
            Toast.makeText(this,message,Toast.LENGTH_LONG).show()

            val intent= Intent(this,SecondActivity::class.java)
            startActivity(intent)

        }

    }
}
