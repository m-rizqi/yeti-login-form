package com.rizqi.yetilogin

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Paint
import androidx.compose.ui.graphics.PaintingStyle
import androidx.compose.ui.graphics.Path
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.drawscope.DrawScope
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.rizqi.yetilogin.ui.theme.BlueLight
import com.rizqi.yetilogin.ui.theme.BlueOutline

fun Chin(drawScope: DrawScope) {

    val chinPath = Path().apply {
        moveTo(84.1f, 121.6f)
        cubicTo(86.8f, 124.5f, 90.2f, 126.9f, 94.0f, 129.0f)
        lineTo(94.9f, 124.5f)
        cubicTo(97.8f, 127.0f, 101.2f, 129.3f, 105.1f, 131.0f)
        cubicTo(105.1f, 129.1f, 105.0f, 127.1f, 105.0f, 125.2f)
        cubicTo(108.0f, 126.4f, 111.2f, 127.2f, 114.7f, 127.7f)
        cubicTo(114.4f, 125.6f, 114.0f, 123.6f, 113.5f, 121.5f)
    }

    drawScope.apply {
        drawPath(
            path = chinPath,
            color = BlueOutline,
            style = Stroke(width = strokeWidth, cap = StrokeCap.Round, join = StrokeJoin.Round))
    }
}

@Preview()
@Composable
fun ChinPreview() {
    Canvas(modifier = Modifier.size(100.dp)) {
        Chin(drawScope = this)
    }
}
