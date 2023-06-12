package com.example.latihanretrofit

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ListAdapter(val context: Context, val userList: List<AlbumsItem>): RecyclerView.Adapter<ListAdapter.ViewHolder>() {

    private var data = emptyList<AlbumsItem>()
    inner class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        var id = itemView.findViewById<TextView>(R.id.tv_id)
        var title = itemView.findViewById<TextView>(R.id.tv_title)
        var userId = itemView.findViewById<TextView>(R.id.tv_user)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        var itemView = LayoutInflater.from(context).inflate(R.layout.custom_row, parent, false)
        return ViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.id.text = userList[position].id.toString()
        holder.title.text = userList[position].title
        holder.userId.text = userList[position].userId.toString()
    }

    override fun getItemCount(): Int {
        return userList.count()
    }
}
