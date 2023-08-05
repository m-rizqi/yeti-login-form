package com.rizqi.yetilogin

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Path
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.drawscope.DrawScope
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.rizqi.yetilogin.ui.theme.BlueLight
import com.rizqi.yetilogin.ui.theme.BlueOutline

fun Face(drawScope: DrawScope) {

    val facePath = Path().apply {
        moveTo(134.5f, 46f)
        lineTo(134.5f, 81.5f)
        cubicTo(134.5f, 103.315f, 119.054f, 121.0f, 99.0f, 121.0f)
        cubicTo(78.946f, 121.0f, 63.5f, 103.315f, 63.5f, 81.5f)
        lineTo(63.5f, 46f)
    }

    drawScope.apply {
        drawPath(
            path = facePath,
            color = BlueLight
        )
    }
}

@Preview()
@Composable
fun FacePreview() {
    Canvas(modifier = Modifier.size(100.dp)) {
        Face(drawScope = this)
    }
}
