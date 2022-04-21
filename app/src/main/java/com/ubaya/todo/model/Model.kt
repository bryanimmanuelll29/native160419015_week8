package com.ubaya.todo.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

// UNTUK MENDEFINISIKAN CLASS2 (TABEL) YANG ADA DI DATABASE

@Entity
data class Todo(
    @ColumnInfo(name="title")
    var title:String,
    @ColumnInfo(name="notes")
    var notes:String,
    @ColumnInfo(name="priority")
    var priority: Int
) {
    @PrimaryKey(autoGenerate = true)
    var uuid:Int =0
}
