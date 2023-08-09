package com.rizqi.yetilogin

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Rect
import androidx.compose.ui.graphics.Color
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

fun Body(drawScope: DrawScope) {

    val bodyPath = Path().apply {
        moveTo(193.3f, 135.9f)
        cubicTo(187.5f, 127.9f, 177.8f, 122.0f, 166.8f, 122.0f)
        lineTo(151f, 122.0f)
        lineTo(151f, 72f)
        cubicTo(151f, 44.4f, 128.6f, 22f, 101f, 22f)
        cubicTo(73.4f, 22f, 51f, 44.4f, 51f, 72f)
        lineTo(51f, 122.0f)
        lineTo(32.1f, 122.0f)
        cubicTo(21.5f, 122.0f, 12.1f, 127.1f, 6.3f, 134.9f)
        lineTo(6.3f, 212.9f)
        lineTo(193.3f, 212.9f)
        lineTo(193.3f, 135.9f)
        close()
    }

    val bodyOutlinePath = Path().apply {
        moveTo(193.3f, 135.9f)
        cubicTo(187.5f, 127.5f, 177.8f, 122.0f, 166.8f, 122.0f)
        lineTo(151f, 122.0f)
        lineTo(151f, 72f)
        cubicTo(151f, 44.4f, 128.6f, 22f, 101f, 22f)
        cubicTo(73.4f, 22f, 51f, 44.4f, 51f, 72f)
        lineTo(51f, 122.0f)
        lineTo(32.1f, 122.0f)
        cubicTo(21.5f, 122.0f, 12.1f, 127.1f, 6.3f, 134.9f)
        lineTo(6.3f, 212.9f)
        lineTo(193.3f, 212.9f)
        lineTo(193.3f, 135.9f)
        close()
    }
    val chestPath = Path().apply {
        moveTo(100f, 156.4f)
        cubicTo(77.1f, 156.4f, 57f, 167.5f, 45.9f, 184.1f)
        cubicTo(61.5f, 194.1f, 80.1f, 200f, 100f, 200f)
        cubicTo(119.9f, 200f, 138.5f, 194.1f, 154.1f, 184.1f)
        cubicTo(143f, 167.5f, 122.9f, 156.4f, 100f, 156.4f)
        close()
    }

    drawScope.apply {
        drawPath(path = bodyPath, color = Color.White)
        drawPath(
            path = bodyOutlinePath,
            color = BlueOutline,
            style = Stroke(width = strokeWidth, cap = StrokeCap.Round, join = StrokeJoin.Round)
        )
        drawPath(path = chestPath, color = BlueLight)
    }
}

@Preview()
@Composable
fun BodyPreview() {
    Canvas(modifier = Modifier.size(100.dp)) {
        Body(drawScope = this)
    }
}
