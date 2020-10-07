package ucb.edu.bo

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.row_user.view.*
import ucb.edu.bo.RoomDatabase.Book

class UserListAdapter(val items: ArrayList<Book>, val context: Context): RecyclerView.Adapter<UserListAdapter.UserListViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UserListViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.row_user, parent, false)
        return UserListViewHolder(v)
    }

    override fun getItemCount(): Int {
        return items.count()
    }

    override fun onBindViewHolder(holder: UserListViewHolder, position: Int) {
        val libro = items.get(position)
        holder.itemView.nameTextView.text = libro.title
        holder.itemView.pagesTextView.text = libro.pages
        holder.itemView.autorTextView.text = libro.author
        holder.itemView.editorialTextView.text = libro.editorial
        holder.itemView.descripcionTextView.text = libro.description
        loadImages(libro,holder)

    }


    fun loadImages(libro: Book, holder: UserListViewHolder) {
      val picasso = Picasso.get()
      picasso.load(libro.photoUrl).into(holder.itemView.urlImageView)

  }

    class UserListViewHolder(itemView: View): RecyclerView.ViewHolder(itemView)

}

