package ucb.edu.bo.RoomDatabase
import androidx.room.*


@Dao
interface IBookDao {

    @Query("SELECT * FROM book_table")
    fun getList(): List<Book>

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    fun insert(book:Book)


    @Delete
    fun delete(book: Book)
}