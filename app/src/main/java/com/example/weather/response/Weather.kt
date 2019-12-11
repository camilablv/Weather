package com.example.weather.response

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Weather (
    val description: String,
    val icon: String
) : Parcelable