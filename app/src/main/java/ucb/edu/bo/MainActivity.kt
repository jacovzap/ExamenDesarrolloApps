package ucb.edu.bo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import ucb.edu.bo.RoomDatabase.Book
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        startActivity(Intent(this, BookActivity::class.java))


    }
}