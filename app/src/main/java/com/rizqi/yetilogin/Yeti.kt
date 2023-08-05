package com.rizqi.yetilogin

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.rizqi.yetilogin.Body
import com.rizqi.yetilogin.EarLeft

@Composable
fun Yeti() {
    Canvas(modifier = Modifier.size(100.dp)) {
        Body(drawScope = this)
        EarLeft(drawScope = this)
        EarRight(drawScope = this)
        Chin(drawScope = this)
        Face(drawScope = this)
        Hair(drawScope = this)
        Eyebrow(drawScope = this)
        EyeLeft(drawScope = this)
        EyeRight(drawScope = this)
        Mouth(drawScope = this)
        Nose(drawScope = this)
    }
}

@Preview
@Composable
fun YetiPreview() {
    Yeti()
}