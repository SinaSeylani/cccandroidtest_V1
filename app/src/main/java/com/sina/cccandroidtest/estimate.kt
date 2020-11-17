package com.sina.cccandroidtest

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import java.util.*

@Entity
data class estimate (
    @PrimaryKey val id: String,
    @ColumnInfo(name = "company") val company: String?,
    @ColumnInfo(name = "address") val address: String?,
    @ColumnInfo(name = "number") val number: Int?,
    @ColumnInfo(name = "revision_number") val revision_number: Int?,
    @ColumnInfo(name = "created_date") val created_date: String?,
    @ColumnInfo(name = "created_by") val created_by: String?,
    @ColumnInfo(name = "requested_by") val requested_by: String?,
    @ColumnInfo(name = "contact") val contact: String?
)