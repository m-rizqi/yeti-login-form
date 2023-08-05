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

fun EarRight(drawScope: DrawScope) {
    val earRightOuterPath = Path().apply {
        addOval(Rect(
            center = Offset(155f, 83f),
            radius = 11.5f,
        ))
    }
    val earRightInnerPath = Path().apply {
        moveTo(155.7f, 78.9f)
        cubicTo(155.7f, 78.9f, 157.6f, 80.8f, 157.6f, 83f)
        cubicTo(157.6f, 85.3f, 155.7f, 87.2f, 153.5f, 87.2f)
    }


    drawScope.apply {
        drawPath(earRightOuterPath, color = BlueLight)
        drawPath(earRightOuterPath, color = BlueLight, style = Stroke(
            width = strokeWidth,
            cap = StrokeCap.Round,
            join = StrokeJoin.Round
        ))
        drawPath(earRightInnerPath, color = BlueOutline, style = Stroke(
            width = strokeWidth,
            cap = StrokeCap.Round,
            join = StrokeJoin.Round
        ))
        EarRightHair(this)
    }
}

fun EarRightHair(drawScope: DrawScope){
    val earRightHairPath = Path().apply {
        moveTo(148.6f, 62.8f)
        cubicTo(153.5f, 67.4f, 157f, 72.2f, 159.2f, 77f)
        cubicTo(155.8f, 76.9f, 152.4f, 76.9f, 149.1f, 77.1f)
        cubicTo(153.1f, 80.8f, 155.9f, 84.7f, 157.3f, 88.7f)
        cubicTo(155.2f, 88.7f, 153.1f, 88.7f, 151f, 88.9f)
        cubicTo(153.6f, 93f, 154.8f, 97.2f, 154.7f, 101.4f)
        cubicTo(153.5f, 100.7f, 151.3f, 100f, 149.5f, 99.5f)
    }
    val earRightHairBoxPath = Path().apply {
        addRect(Rect(
            topLeft = Offset(131f, 64f),
            bottomRight = Offset(151f, 99f)
        ))
    }

    drawScope.apply {
        drawPath(earRightHairBoxPath, color = Color.White)
        drawPath(earRightHairPath, color = Color.White)
        drawPath(earRightHairPath, color = BlueOutline, style = Stroke(
            width = strokeWidth,
            cap = StrokeCap.Round,
            join = StrokeJoin.Round
        ))
    }
}

@Preview
@Composable
fun EarRightPreview() {
    Canvas(modifier = Modifier.size(100.dp)) {
        EarRight(drawScope = this)
    }
}

