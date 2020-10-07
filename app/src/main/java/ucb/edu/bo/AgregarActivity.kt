package ucb.edu.bo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.activity_agregar.*
import ucb.edu.bo.RoomDatabase.AppRoomDatabase
import ucb.edu.bo.RoomDatabase.Book
import ucb.edu.bo.RoomDatabase.BookRepository

class AgregarActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_agregar)



        btnIngresar.setOnClickListener()
        {
            val bookDao = AppRoomDatabase.getDatabase(applicationContext).bookDato()
            val repository = BookRepository(bookDao)
            /*repository.insert(Book(2, titulotxt.toString(), pagestxt.toString(),editorialtxt.toString(),autortxt.toString(),descripciontxt.toString(),urltxt.toString() ))*/
            Snackbar.make(IngresarLayout, "Ha ocurrido un error al acceder al repository", Snackbar.LENGTH_LONG).show()

            titulotxt.text = null
            pagestxt.text = null
            editorialtxt.text = null
            autortxt.text = null
            descripciontxt.text = null
            urltxt.text = null
        }


        }
    }
