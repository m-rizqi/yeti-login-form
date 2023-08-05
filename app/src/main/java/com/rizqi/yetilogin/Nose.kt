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
import com.rizqi.yetilogin.ui.theme.BlueOutline

fun Nose(drawScope: DrawScope) {

    val nosePath = Path().apply {
        moveTo(97.7f, 79.9f)
        lineTo(102.4f, 79.9f)
        cubicTo(104.3f, 79.9f, 105.4f, 82.1f, 104.3f, 83.6f)
        lineTo(102f, 86.9f)
        cubicTo(101.1f, 88.2f, 99.1f, 88.2f, 98.2f, 86.9f)
        lineTo(95.9f, 83.6f)
        cubicTo(94.6f, 82.1f, 95.7f, 79.9f, 97.7f, 79.9f)
        close()
    }

    drawScope.apply {
        drawPath(
            path = nosePath,
            color = BlueOutline
        )
    }
}

@Preview()
@Composable
fun NosePreview() {
    Canvas(modifier = Modifier.size(100.dp)) {
        Nose(drawScope = this)
    }
}
