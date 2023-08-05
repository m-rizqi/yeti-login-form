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
import com.rizqi.yetilogin.ui.theme.BlueCyan
import com.rizqi.yetilogin.ui.theme.BlueLight
import com.rizqi.yetilogin.ui.theme.BlueOutline

fun ArmLeft(drawScope: DrawScope) {

    val palmPath = Path().apply {
        moveTo(121.3f, 97.4f)
        lineTo(111f, 58.7f)
        lineTo(149.8f, 48.3f)
        lineTo(169.8f, 84.4f)
        close()
    }

    val palmOutlinePath = Path().apply {
        moveTo(121.3f, 97.4f)
        lineTo(111f, 58.7f)
        lineTo(149.8f, 48.3f)
        moveTo(121.3f, 97.4f)
        lineTo(169.8f, 84.4f)
    }

    val fingersPath = Path().apply {
        moveTo(134.4f, 52.5f)
        lineTo(153.7f, 47.3f)
        cubicTo(156.4f, 46.6f, 159.1f, 48.2f, 159.8f, 50.9f)
        cubicTo(160.5f, 53.6f, 158.9f, 56.3f, 156.2f, 57f)
        lineTo(146f, 59.7f)

        moveTo(160.8f, 76.5f)
        lineTo(180.2f, 71.3f)
        cubicTo(182.9f, 70.6f, 185.6f, 72.2f, 186.3f, 74.9f)
        cubicTo(187f, 77.6f, 185.4f, 80.3f, 182.7f, 81f)
        lineTo(164.4f, 85.9f)

        moveTo(158.3f, 66.8f)
        lineTo(181.4f, 60.6f)
        cubicTo(184.1f, 59.9f, 186.8f, 61.5f, 187.5f, 64.2f)
        cubicTo(188.2f, 66.9f, 186.6f, 69.6f, 183.9f, 70.3f)
        lineTo(160.8f, 76.5f)

        moveTo(150.9f, 58.4f)
        lineTo(176.9f, 51.4f)
        cubicTo(179.6f, 50.7f, 182.3f, 52.3f, 183f, 55f)
        cubicTo(183.7f, 57.7f, 182.1f, 60.4f, 179.4f, 61.1f)
        lineTo(158.1f, 66.8f)
    }

    val nailsPath = Path().apply {
        moveTo(207.9f, 74.7f)
        lineTo(205.7f, 74.1f)
        cubicTo(204.6f, 73.8f, 203.5f, 74.4f, 203.2f, 75.5f)
        cubicTo(202.9f, 76.6f, 203.5f, 77.7f, 204.6f, 78f)
        lineTo(206.8f, 78.6f)
        lineTo(207.8f, 74.8f)

        moveTo(206.7f, 64f)
        lineTo(204.5f, 63.4f)
        cubicTo(203.4f, 63.1f, 202.3f, 63.7f, 202f, 64.8f)
        cubicTo(201.7f, 65.9f, 202.3f, 67f, 203.4f, 67.3f)
        lineTo(205.6f, 67.9f)
        lineTo(206.6f, 64.1f)

        moveTo(211.2f, 54.8f)
        lineTo(209f, 54.2f)
        cubicTo(207.9f, 53.9f, 206.8f, 54.5f, 206.5f, 55.6f)
        cubicTo(206.2f, 56.7f, 206.8f, 57.8f, 207.9f, 58.1f)
        lineTo(210.1f, 58.7f)
        lineTo(211.1f, 55f)

        moveTo(234.6f, 49.4f)
        lineTo(232.4f, 48.8f)
        cubicTo(231.3f, 48.5f, 230.2f, 49.1f, 229.9f, 50.2f)
        cubicTo(229.6f, 51.3f, 230.2f, 52.4f, 231.3f, 52.7f)
        lineTo(233.5f, 53.3f)
        lineTo(234.5f, 49.5f)
    }

    val armPath = Path().apply {
        moveTo(123.5f, 96.8f)
        cubicTo(82.1f, 111.7f, 39.4f, 127.5f, 15.3f, 132.3f)
        lineTo(1.2f, 80f)
        cubicTo(34.7f, 70.1f, 73.1f, 63.5f, 113.1f, 58.2f)
    }

    val wristPath = Path().apply {
        moveTo(108.5f, 59.4f)
        cubicTo(116.2f, 54.1f, 123.8f, 51.0f, 132.3f, 46.2f)
        cubicTo(129.9f, 51.5f, 127.6f, 56.5f, 125.6f, 61.3f)
        cubicTo(130.8f, 61.6f, 135.0f, 62.0f, 139.9f, 62.6f)
        cubicTo(135.7f, 67.6f, 131.8f, 72.2f, 128.4f, 76.5f)
        cubicTo(131.5f, 77.6f, 134.4f, 78.9f, 137.1f, 80.3f)
        cubicTo(135.7f, 83.2f, 134.4f, 86.1f, 133.2f, 88.8f)
        cubicTo(135.7f, 92.3f, 137.8f, 96.0f, 139.5f, 99.8f)
        cubicTo(134.6f, 99.0f, 130.5f, 99.1f, 123.3f, 97.1f)
        moveTo(94.5f, 102.8f)
        cubicTo(93.9f, 106.8f, 90.7f, 111.7f, 85.1f, 117.5f)
        cubicTo(82.5f, 115.7f, 80.1f, 113.8f, 77.9f, 111.8f)
        cubicTo(75.4f, 115.9f, 71.3f, 120.6f, 65.7f, 125.8f)
        cubicTo(63.8f, 123.6f, 62.3f, 121.3f, 61.2f, 118.9f)
        cubicTo(56.8f, 122.2f, 52.7f, 125.8f, 47.8f, 129.7f)
        cubicTo(47.6f, 126.3f, 48.0f, 122.6f, 49.0f, 118.8f)
        moveTo(97.5f, 62.9f)
        cubicTo(95.8f, 60.5f, 91.6f, 58.8f, 84.1f, 57.7f)
        cubicTo(83.2f, 60.0f, 82.3f, 62.1f, 81.6f, 64.3f)
        cubicTo(78.0f, 62.5f, 72.4f, 60.2f, 65.4f, 59.5f)
        cubicTo(66.9f, 61.8f, 68.6f, 63.9f, 70.5f, 66.0f)
        cubicTo(65.5f, 65.4f, 59.3f, 65.1f, 52.1f, 65.0f)
        cubicTo(54.1f, 68.0f, 53.0f, 68.6f, 56.0f, 71.3f)
    }

    drawScope.apply {
        drawPath(
            path = palmPath,
            color = BlueLight
        )
        drawPath(
            path = fingersPath,
            color = BlueLight
        )
        drawPath(
            path = palmOutlinePath,
            color = BlueOutline,
            style = Stroke(width = strokeWidth, cap = StrokeCap.Round, join = StrokeJoin.Round, miter = 10f)
        )
        drawPath(
            path = fingersPath,
            color = BlueOutline,
            style = Stroke(width = strokeWidth, cap = StrokeCap.Round, join = StrokeJoin.Round, miter = 10f)
        )
        drawPath(
            path = nailsPath,
            color = BlueCyan
        )
        drawPath(
            path = armPath,
            color = Color.White
        )
        drawPath(
            path = armPath,
            color = BlueOutline,
            style = Stroke(width = strokeWidth, cap = StrokeCap.Round, join = StrokeJoin.Round, miter = 10f)
        )
        drawPath(
            path = wristPath,
            color = Color.White
        )
        drawPath(
            path = wristPath,
            color = BlueOutline,
            style = Stroke(width = strokeWidth, cap = StrokeCap.Round, join = StrokeJoin.Round, miter = 10f)
        )
    }
}

@Preview()
@Composable
fun ArmLeftPreview() {
    Canvas(modifier = Modifier.size(100.dp)) {
        ArmLeft(drawScope = this)
    }
}
