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

fun Eyebrow(drawScope: DrawScope) {

    val eyebrowBackgroundPath = Path().apply {
        moveTo(138.142f, 55.064f)
        cubicTo(133.212f, 56.323f, 128.268f, 57.182f, 123.355f, 57.663f)
        cubicTo(123.019f, 61.004f, 122.579f, 64.352f, 122.033f, 67.7f)
        cubicTo(117.464f, 66.235f, 113.124f, 64.478f, 109.037f, 62.474f)
        cubicTo(108.057f, 65.549f, 106.967f, 68.611f, 105.77f, 71.653f)
        cubicTo(100.256f, 68.586f, 95.211f, 65.108f, 90.673f, 61.324f)
        cubicTo(88.867f, 64.213f, 87.028f, 67.054f, 85.157f, 69.847f)
        cubicTo(77.241f, 65.723f, 70.104f, 60.733f, 63.861f, 55.109f)
        lineTo(64.968f, 43.341f)
        lineTo(138.443f, 43.341f)
        lineTo(138.443f, 55.064f)
        close()
    }

    val eyebrowPath = Path().apply {
        moveTo(63.56f, 55.102f)
        cubicTo(69.803f, 60.726f, 76.94f, 65.716f, 84.157f, 69.5f)
        cubicTo(86.028f, 66.707f, 87.867f, 63.866f, 89.673f, 61.977f)
        cubicTo(94.211f, 65.761f, 99.256f, 69.239f, 104.77f, 72.306f)
        cubicTo(105.967f, 69.264f, 107.057f, 66.202f, 108.037f, 63.127f)
        cubicTo(112.124f, 65.131f, 116.464f, 66.888f, 121.033f, 68.353f)
        cubicTo(121.579f, 64.004f, 122.019f, 60.656f, 122.355f, 57.317f)
        cubicTo(128.268f, 56.836f, 133.212f, 55.977f, 138.142f, 54.718f)
    }

    drawScope.apply {
        drawPath(eyebrowBackgroundPath, Color.White)
        drawPath(
            path = eyebrowPath,
            color = BlueOutline,
            style = Stroke(width = strokeWidth, cap = StrokeCap.Round, join = StrokeJoin.Round))
    }
}

@Preview()
@Composable
fun EyebrowPreview() {
    Canvas(modifier = Modifier.size(100.dp)) {
        Eyebrow(drawScope = this)
    }
}
