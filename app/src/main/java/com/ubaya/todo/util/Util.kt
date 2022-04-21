package com.ubaya.todo.util

import android.content.Context
import androidx.room.Room
import androidx.room.migration.Migration
import androidx.sqlite.db.SupportSQLiteDatabase
import com.ubaya.todo.model.TodoDatabase

val DB_NAME = "tododb"

fun buildDb(context: Context) =
    Room.databaseBuilder(context, TodoDatabase::class.java, "tododb")
        .addMigrations(MIGRATION_1_2)
        .build()

val MIGRATION_1_2 = object : Migration(1, 2) {
    override fun migrate(database: SupportSQLiteDatabase) {
        database.execSQL("ALTER TABLE todo ADD COLUMN priority INTEGER DEFAULT 3 not null")
    }
}