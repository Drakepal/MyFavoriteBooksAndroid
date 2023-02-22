package com.example.myfavoritebooksandroid

var booklist = mutableListOf<Books>()

class Books (
            var cover: Int,
            var author: String,
            var title: String,
            var description: String,
            var id: Int? = booklist.size
        )

