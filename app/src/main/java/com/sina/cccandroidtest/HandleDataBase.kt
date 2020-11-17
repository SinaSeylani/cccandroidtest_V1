package com.sina.cccandroidtest

import android.content.Context
import androidx.room.Database
import androidx.room.RoomDatabase
import java.io.IOException

@Database(entities = arrayOf(estimate::class), version = 1)
abstract class EstimateDatabase : RoomDatabase() {
    abstract fun estimateDao(): EstimateDao
}

@Database(entities = arrayOf(person::class), version = 1)
abstract class PersonDatabase : RoomDatabase() {
    abstract fun personDao(): PersonDao
}

