package com.ghostapps.placapp.data.records

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = [RecordEntity::class], version = 1, exportSchema = false)
abstract class RecordDatabase: RoomDatabase() {
    abstract fun recordDao(): RecordDao
}