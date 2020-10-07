package ucb.edu.bo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_agregar.*
import kotlinx.android.synthetic.main.activity_book.*
import ucb.edu.bo.RoomDatabase.AppRoomDatabase
import ucb.edu.bo.RoomDatabase.Book
import ucb.edu.bo.RoomDatabase.BookRepository

class BookActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_book)

        val lista = arrayListOf<Book>()
        lista.add(Book(1, "La vuelta al mundo en 80 dias", "99", "Antigua", "Julio Verne", "La vuelta al mundo en ochenta días es una novela del escritor francés Julio Verne ",  "https://i.pinimg.com/564x/a8/6e/26/a86e26dffbcd0f8ffd0b7a6a4809ec68.jpg"))
        lista.add(Book(2, "La isla misteriosa", "280", "Antigua", "Julio Verne", "La isla misteriosa es una novela de Julio Verne, publicada en la Magasin dEducation et de Rcration ",  "https://loresumo.com/wp-content/uploads/2019/11/resumen-de-la-isla-misteriosa-2.jpg"))

        val userListAdapter = UserListAdapter(lista, this)
        recyclerView.adapter = userListAdapter
        val linearLayoutManager = LinearLayoutManager(this)
        linearLayoutManager.orientation = LinearLayoutManager.VERTICAL
        recyclerView.layoutManager = linearLayoutManager


        floatingAgregateButton.setOnClickListener()
        {

            startActivity(Intent(this, AgregarActivity::class.java))
        }





    }
}