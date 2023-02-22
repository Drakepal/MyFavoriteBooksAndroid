package com.example.myfavoritebooksandroid

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.myfavoritebooksandroid.databinding.BookCardCellBinding

class CardAdapter(private val myBooks: List<Books>,
private val clickListener: FavoriteBooksClickListenerClickListener)
    : RecyclerView.Adapter<CardViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardViewHolder {
        val from = LayoutInflater.from(parent.context)
        val binding = BookCardCellBinding.inflate(from, parent, false)
        return CardViewHolder(binding, clickListener)
    }

    override fun getItemCount(): Int = myBooks.size



    override fun onBindViewHolder(holder: CardViewHolder, position: Int) {
       holder.bindBook(myBooks[position])
    }

}