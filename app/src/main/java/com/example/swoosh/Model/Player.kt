package com.example.swoosh.Model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
class Player constructor(var league: String, var skill: String) : Parcelable