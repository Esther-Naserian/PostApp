package com.example.postapp

import android.app.LauncherActivity.ListItem
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.appcompat.view.menu.MenuView.ItemView
import androidx.recyclerview.widget.RecyclerView
import com.example.postapp.databinding.ActivityMainBinding
class PostAdapter(var postList: List<Post>):
    RecyclerView.Adapter<PostsViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PostsViewHolder {
        val itemView= LayoutInflater.from(parent.context)
            .inflate(R.layout.information_details, parent, false)
        return PostsViewHolder(itemView)
    }

    override fun onBindViewHolder(holder:PostsViewHolder, position: Int) {
        val post= postList[position]
        holder.body.text=post.body
        holder.title.text=post.title
        holder.id.text= " ${post.id}"
        holder.userId.text=" ${post.userId}"

    }

    override fun getItemCount(): Int {
        return postList.size
    }
}



class PostsViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){
    var body = itemView.findViewById<TextView>(R.id.idbody)
    var title = itemView.findViewById<TextView>(R.id.idname)
    var userId = itemView.findViewById<TextView>(R.id.idname)
    var id = itemView.findViewById<TextView>(R.id.iduser)
}







