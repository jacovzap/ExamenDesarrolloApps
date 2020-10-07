package ucb.edu.bo.RoomDatabase

import ucb.edu.bo.RoomDatabase.Book
import ucb.edu.bo.RoomDatabase.IBookDao

class BookRepository(private val bookDao: IBookDao) {

        fun insert(book: Book) {
        bookDao.insert(book)
    }

    fun getListBooks(): List<Book> {
        return bookDao.getList()
    }
}
