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
import com.rizqi.yetilogin.ui.theme.BlueLight
import com.rizqi.yetilogin.ui.theme.BlueOutline

fun EarLeft(drawScope: DrawScope) {
    val earLeftOuterPath = Path().apply {
        addOval(Rect(
            center = Offset(47f, 83f),
            radius = 11.5f,
        ))
    }
    val earLeftInnerPath = Path().apply {
        moveTo(46.3f, 78.9f)
        cubicTo(46.3f, 78.9f, 44.4f, 80.8f, 44.4f, 83f)
        cubicTo(44.4f, 85.3f, 46.3f, 87.2f, 48.5f, 87.2f)
    }


    drawScope.apply {
        drawPath(earLeftOuterPath, color = BlueLight)
        drawPath(earLeftOuterPath, color = BlueLight, style = Stroke(
            width = strokeWidth,
            cap = StrokeCap.Round,
            join = StrokeJoin.Round
        ))
        drawPath(earLeftInnerPath, color = BlueOutline, style = Stroke(
            width = strokeWidth,
            cap = StrokeCap.Round,
            join = StrokeJoin.Round
        ))
        EarLeftHair(this)
    }
}

fun EarLeftHair(drawScope: DrawScope){
    val earLeftHairPath = Path().apply {
        moveTo(53.4f, 62.8f)
        cubicTo(48.5f, 67.4f, 45.0f, 72.2f, 42.8f, 77.0f)
        cubicTo(46.2f, 76.9f, 49.6f, 76.9f, 52.9f, 77.1f)
        cubicTo(48.9f, 80.8f, 46.1f, 84.7f, 44.7f, 88.7f)
        cubicTo(46.8f, 88.7f, 48.9f, 88.7f, 51.0f, 88.9f)
        cubicTo(48.4f, 93.0f, 47.2f, 97.2f, 47.3f, 101.4f)
        cubicTo(48.5f, 100.7f, 50.7f, 100.0f, 52.5f, 99.5f)
    }
    val earLeftHairBoxPath = Path().apply {
        addRect(Rect(
            topLeft = Offset(51f, 64f),
            bottomRight = Offset(66f, 99f)
        ))
    }

    drawScope.apply {
        drawPath(earLeftHairBoxPath, color = Color.White)
        drawPath(earLeftHairPath, color = Color.White)
        drawPath(earLeftHairPath, color = BlueOutline, style = Stroke(
            width = strokeWidth,
            cap = StrokeCap.Round,
            join = StrokeJoin.Round
        ))
    }
}

@Preview
@Composable
fun EarLeftPreview() {
    Canvas(modifier = Modifier.size(100.dp)) {
        EarLeft(drawScope = this)
    }
}

