package com.sina.cccandroidtest

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query

@Dao
interface PersonDao {

    @Query("SELECT * FROM person")
    fun getAll(): List<person>

    @Query("SELECT * FROM person WHERE id IN (:personIds)")
    fun loadAllByIds(personIds: IntArray): List<person>

    @Query(
        "SELECT * FROM person WHERE first_name LIKE :first AND " +
                "last_name LIKE :last LIMIT 1"
    )
    fun findByName(first: String, last: String): person

    @Insert
    fun insertAll(vararg users: person)

    @Delete
    fun delete(user: person)
}
