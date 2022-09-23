package com.serdar.kisilerapp.data.model

import android.os.Parcelable
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import kotlinx.android.parcel.Parcelize

@Parcelize
@Entity(tableName = "contacts")
data class Kisiler(
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "id") val id: Int = 0,
    @ColumnInfo(name = "userName") val userName: String,
    @ColumnInfo(name = "userLastName") val userLastName: String,
    @ColumnInfo(name = "number") val number: Long ,
): Parcelable
