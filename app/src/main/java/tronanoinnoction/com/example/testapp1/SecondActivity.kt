package tronanoinnoction.com.example.testapp1

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity : AppCompatActivity(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val bundle: Bundle? = intent.extras
        val newmsg=bundle!!.getString("user message")

        Toast.makeText(this,newmsg,Toast.LENGTH_SHORT).show()

        viewbox1.text=newmsg
    }
}