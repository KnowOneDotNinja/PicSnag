package ninja.knowone.picsnag

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView

class ImageFeedAdapter(val picurls: ArrayList<String>, val context: Context): RecyclerView.Adapter<ImageFeedAdapter.ViewHolder>() {

    class ViewHolder(view: View): RecyclerView.ViewHolder(view) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val a = LayoutInflater.from(parent.context).inflate(R.layout.feed_cell, parent, false)
        return ViewHolder(a)
    }

    override fun getItemCount() = picurls.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

    }
}