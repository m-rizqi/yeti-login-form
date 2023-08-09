package com.rizqi.yetilogin

import androidx.compose.ui.layout.LayoutCoordinates
import androidx.compose.ui.unit.IntSize

fun getScaleFactor(minBase : Float, maxBase : Float, minTarget: Float, maxTarget : Float) : Float = (maxTarget - minTarget) / (maxBase - minBase)

fun Float.scaleTo(scaleFactor : Float) : Float = this * scaleFactor

