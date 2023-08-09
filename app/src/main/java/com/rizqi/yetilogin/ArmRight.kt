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

fun ArmRight(drawScope: DrawScope) {

    val palmPath = Path().apply {
        moveTo(265.4f, 97.3f)
        lineTo(275.8f, 58.7f)
        lineTo(236.9f, 48.2f)
        lineTo(216.9f, 84.3f)
        close()
    }

    val palmOutlinePath = Path().apply {
        moveTo(265.4f, 97.3f)
        lineTo(275.8f, 58.7f)
        lineTo(236.9f, 48.2f)
        moveTo(265.4f, 97.3f)
        lineTo(216.9f, 84.3f)
    }

    val fingersPath = Path().apply {
        moveTo(252.4f, 52.4f)
        lineTo(233f, 47.2f)
        cubicTo(230.3f, 46.5f, 227.6f, 47.9f, 226.9f, 50.6f)
        cubicTo(226.2f, 53.3f, 227.8f, 56f, 230.5f, 56.7f)
        lineTo(240.8f, 59.5f)

        moveTo(226f, 76.4f)
        lineTo(206.6f, 71.2f)
        cubicTo(203.9f, 70.5f, 201.2f, 71.9f, 200.5f, 74.6f)
        cubicTo(199.8f, 77.3f, 201.4f, 80f, 204.1f, 80.7f)
        lineTo(222.4f, 85.6f)

        moveTo(228.4f, 66.7f)
        lineTo(205.3f, 60.5f)
        cubicTo(202.6f, 59.8f, 199.9f, 61.2f, 199.2f, 63.9f)
        cubicTo(198.5f, 66.6f, 200.1f, 69.3f, 202.8f, 70f)
        lineTo(226f, 76.2f)

        moveTo(235.8f, 58.3f)
        lineTo(209.8f, 51.3f)
        cubicTo(207.1f, 50.6f, 204.4f, 52f, 203.7f, 54.7f)
        cubicTo(203f, 57.4f, 204.6f, 60.1f, 207.3f, 60.8f)
        lineTo(228.6f, 66.5f)
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
        moveTo(263.3f, 96.7f)
        cubicTo(304.7f, 111.6f, 347.4f, 127.4f, 371.5f, 132.2f)
        lineTo(385.5f, 79.9f)
        cubicTo(352.0f, 70.0f, 313.6f, 63.5f, 273.6f, 58.1f)
    }

    val wristPath = Path().apply {
        moveTo(278.2f, 59.3f)
        lineTo(259.6f, 49.3f)
        lineTo(262.1f, 61.2f)
        lineTo(251.4f, 67.7f)
        lineTo(261.3f, 76.4f)
        lineTo(247.4f, 82.8f)
        lineTo(256.5f, 88.7f)
        lineTo(243.3f, 97.9f)
        lineTo(266.4f, 97.0f)
        moveTo(284.5f, 100.1f)
        cubicTo(284.1f, 104.1f, 286.3f, 109.0f, 291.2f, 114.9f)
        cubicTo(294.7f, 113.1f, 297.9f, 111.3f, 301.0f, 109.4f)
        cubicTo(302.8f, 113.6f, 306.1f, 118.3f, 311.1f, 123.5f)
        cubicTo(313.8f, 121.4f, 316.2f, 119.1f, 318.2f, 116.7f)
        cubicTo(322.3f, 120.1f, 327.2f, 123.7f, 333.0f, 127.7f)
        cubicTo(334.2f, 124.3f, 334.8f, 120.7f, 334.7f, 116.8f)
        moveTo(314.0f, 66.7f)
        cubicTo(314.0f, 66.7f, 319.4f, 61.0f, 326.6f, 59.3f)
        cubicTo(328.3f, 62.2f, 329.9f, 65.0f, 331.5f, 67.9f)
        cubicTo(335.3f, 65.4f, 341.3f, 63.5f, 349.7f, 62.2f)
        cubicTo(349.8f, 65.3f, 349.8f, 68.3f, 349.7f, 71.4f)
        cubicTo(355.2f, 70.4f, 362.2f, 69.8f, 370.5f, 69.5f)
        cubicTo(369.1f, 73.4f, 367.9f, 77.9f, 366.9f, 82.4f)
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
fun ArmRightPreview() {
    Canvas(modifier = Modifier.size(200.dp)) {
        ArmRight(drawScope = this)
    }
}
