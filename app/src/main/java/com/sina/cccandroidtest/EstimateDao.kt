package com.sina.cccandroidtest

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query

@Dao
interface EstimateDao {
    @Query("SELECT * FROM estimate")
    fun getAll(): List<estimate>

    @Query("SELECT * FROM estimate WHERE id IN (:estimateIds)")
    fun loadAllByIds(estimateIds: IntArray): List<estimate>


    @Insert
    fun insertAll(vararg estimate: estimate)

    @Delete

    fun delete(estimate: estimate)

}