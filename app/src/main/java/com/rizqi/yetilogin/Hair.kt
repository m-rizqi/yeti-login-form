package com.rizqi.yetilogin

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Path
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.drawscope.DrawScope
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.rizqi.yetilogin.ui.theme.BlueOutline

fun Hair(drawScope: DrawScope) {

    val hairPath = Path().apply {
        moveTo(81.457f, 27.929f)
        cubicTo(83.212f, 23.845f, 86.967f, 19.667f, 92.71f, 16.159f)
        cubicTo(93.689f, 18.724f, 94.593f, 21.299f, 95.422f, 23.882f)
        cubicTo(98.584f, 19.617f, 104.048f, 15.612f, 111.694f, 12.647f)
        cubicTo(110.957f, 15.94f, 110.106f, 19.22f, 109.14f, 22.484f)
        cubicTo(114.997f, 20.368f, 121.189f, 18.844f, 128.568f, 18.328f)
        cubicTo(126.165f, 21.558f, 123.547f, 24.719f, 120.716f, 27.802f)
    }

    drawScope.apply {
        drawPath(hairPath, Color.White)
        drawPath(
            path = hairPath,
            color = BlueOutline,
            style = Stroke(width = strokeWidth, cap = StrokeCap.Round, join = StrokeJoin.Round))
    }
}

@Preview()
@Composable
fun HairPreview() {
    Canvas(modifier = Modifier.size(100.dp)) {
        Hair(drawScope = this)
    }
}
