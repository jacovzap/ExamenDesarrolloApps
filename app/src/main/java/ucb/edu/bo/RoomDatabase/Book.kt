package ucb.edu.bo.RoomDatabase
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "book_table")
data class Book (

    @PrimaryKey(autoGenerate = true) val id : Int,
    @ColumnInfo(name = "title") val title: String?,
    @ColumnInfo(name = "pages") val pages: String?,
    @ColumnInfo(name = "editorial") val editorial: String?,
    @ColumnInfo(name = "author") val author: String?,
    @ColumnInfo(name = "description") val description: String?,
    @ColumnInfo(name = "photoUrl") val photoUrl: String?
)