package com.rizqi.yetilogin

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Rect
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Path
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.drawscope.DrawScope
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.rizqi.yetilogin.ui.theme.BlueOutline

fun EyeRight(drawScope: DrawScope) {

    val eyeRightPath = Path().apply {
        addOval(Rect(
            center = Offset(114.5f, 78.5f),
            radius = 3.5f
        ))
    }
    val eyeRightPupilPath = Path().apply {
        addOval(Rect(
            center = Offset(113f, 76f),
            radius = 1f
        ))
    }

    drawScope.apply {
        drawPath(eyeRightPath, BlueOutline)
        drawPath(eyeRightPupilPath, Color.White)
    }
}

@Preview()
@Composable
fun EyeRightPreview() {
    Canvas(modifier = Modifier.size(100.dp)) {
        EyeRight(drawScope = this)
    }
}
