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
import androidx.compose.ui.graphics.drawscope.clipPath
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.rizqi.yetilogin.ui.theme.BlueMouthBackground
import com.rizqi.yetilogin.ui.theme.BlueOutline
import com.rizqi.yetilogin.ui.theme.RedTongue

fun Mouth(drawScope: DrawScope) {
    val mouthMaskPath = Path().apply {
        moveTo(100.2f, 101f)
        cubicTo(99.8f, 101f, 98.8f, 101f, 98.4f, 101f)
        cubicTo(95.7f, 100.7f, 93.1f, 99.9f, 90.4f, 98.5f)
        cubicTo(89.7f, 98.2f, 89.5f, 97.3f, 89.8f, 96.7f)
        cubicTo(90.0f, 96.2f, 90.5f, 96.0f, 91.0f, 96.0f)
        cubicTo(91.2f, 96.0f, 91.5f, 96.1f, 91.6f, 96.2f)
        cubicTo(94.6f, 97.7f, 97.4f, 98.5f, 100.2f, 98.5f)
        cubicTo(103.0f, 98.5f, 105.8f, 97.7f, 108.6f, 96.2f)
        cubicTo(108.8f, 96.1f, 109.0f, 96.0f, 109.2f, 96.0f)
        cubicTo(109.7f, 96.0f, 110.2f, 96.3f, 110.4f, 96.7f)
        cubicTo(110.9f, 97.4f, 110.7f, 98.3f, 110.0f, 98.7f)
        cubicTo(107.4f, 100.1f, 104.7f, 100.9f, 102.1f, 101.2f)
        cubicTo(101.7f, 101.2f, 100.5f, 101.2f, 100.2f, 101.2f)
        close()
    }

    MouthBackground(drawScope)
    drawScope.clipPath(mouthMaskPath){
        Tongue(this)
        Tooth(this)
    }
    MouthOutline(drawScope)
}

fun MouthBackground(drawScope: DrawScope) {

    val mouthBackgroundPath = Path().apply {
        moveTo(100.2f, 101f)
        cubicTo(99.8f, 101f, 98.8f, 101f, 98.4f, 101f)
        cubicTo(95.7f, 100.7f, 93.1f, 100.1f, 90.4f, 98.7f)
        cubicTo(89.7f, 98.4f, 89.5f, 97.5f, 89.8f, 96.9f)
        cubicTo(90f, 96.4f, 90.5f, 96.2f, 91f, 96.2f)
        cubicTo(91.2f, 96.2f, 91.5f, 96.3f, 91.6f, 96.4f)
        cubicTo(94.6f, 97.9f, 97.4f, 98.7f, 100.2f, 98.7f)
        cubicTo(103f, 98.7f, 105.8f, 97.9f, 108.8f, 96.4f)
        cubicTo(109.3f, 96.2f, 109.8f, 96.4f, 110f, 96.9f)
        cubicTo(110.3f, 97.5f, 110.1f, 98.4f, 109.4f, 98.7f)
        cubicTo(106.7f, 100.1f, 104.1f, 100.7f, 101.4f, 101f)
        cubicTo(100.7f, 101f, 100.5f, 101f, 100.2f, 101f)
        close()
    }

    drawScope.apply {
        drawPath(mouthBackgroundPath, BlueMouthBackground)
    }
}

fun MouthSmallBackground(drawScope: DrawScope) {
    val mouthSmallBackgroundPath = Path().apply {
        moveTo(100.2f, 101f)
        cubicTo(99.8f, 101f, 98.8f, 101f, 98.4f, 101f)
        cubicTo(95.7f, 100.7f, 93.1f, 99.9f, 90.4f, 98.5f)
        cubicTo(89.7f, 98.2f, 89.5f, 97.3f, 89.8f, 96.7f)
        cubicTo(90.0f, 96.2f, 90.5f, 96.0f, 91.0f, 96.0f)
        cubicTo(91.2f, 96.0f, 91.5f, 96.1f, 91.6f, 96.2f)
        cubicTo(94.6f, 97.7f, 97.4f, 98.5f, 100.2f, 98.5f)
        cubicTo(103.0f, 98.5f, 105.8f, 97.7f, 108.6f, 96.2f)
        cubicTo(108.8f, 96.1f, 109.0f, 96.0f, 109.2f, 96.0f)
        cubicTo(109.7f, 96.0f, 110.2f, 96.3f, 110.4f, 96.7f)
        cubicTo(110.9f, 97.4f, 110.7f, 98.3f, 110.0f, 98.7f)
        cubicTo(107.4f, 100.1f, 104.7f, 100.9f, 102.1f, 101.2f)
        cubicTo(101.7f, 101.2f, 100.6f, 101.2f, 100.2f, 101.2f)
    }

    drawScope.apply {
        drawPath(mouthSmallBackgroundPath, BlueMouthBackground)
    }
}

fun MouthMediumBackground(drawScope: DrawScope){
    val mouthMediumBackgroundPath = Path().apply {
        moveTo(95f, 104.2f)
        lineTo(86.8f, 104.2f)
        cubicTo(85.6f, 104.2f, 84.6f, 103.2f, 84.6f, 102f)
        lineTo(84.6f, 100f)
        cubicTo(84.6f, 98.8f, 85.6f, 97.8f, 86.8f, 97.8f)
        lineTo(108.8f, 97.8f)
        cubicTo(110f, 97.8f, 111f, 98.8f, 111f, 100f)
        lineTo(111f, 102f)
        cubicTo(111f, 103.2f, 110f, 104.2f, 108.8f, 104.2f)
        lineTo(95f, 104.2f)
        close()
    }

    drawScope.apply {
        drawPath(mouthMediumBackgroundPath, BlueMouthBackground)
    }
}

fun MouthLargeBackground(drawScope: DrawScope){
    val mouthLargeBackgroundPath = Path().apply {
        moveTo(100f, 110.2f)
        cubicTo(91f, 110.2f, 83.8f, 102.9f, 83.8f, 94f)
        cubicTo(83.8f, 91.7f, 85.7f, 89.8f, 88f, 89.8f)
        lineTo(112f, 89.8f)
        cubicTo(114.3f, 89.8f, 116.2f, 91.7f, 116.2f, 94f)
        cubicTo(116.2f, 102.9f, 109f, 110.2f, 100f, 110.2f)
        close()
    }

    drawScope.apply {
        drawPath(mouthLargeBackgroundPath, BlueMouthBackground)
        drawPath(
            path = mouthLargeBackgroundPath,
            color = BlueOutline,
            style = Stroke(width = strokeWidth, cap = StrokeCap.Round, join = StrokeJoin.Round)
        )
    }
}

fun Tongue(drawScope: DrawScope) {
    val tonguePath = Path().apply { 
        addOval(
            Rect(
                center = Offset(100f, 107f),
                radius = 8f
            )
        )
    }

    val tongueHighlight = Path().apply {
        addOval(
            Rect(
                center = Offset(100f, 100.5f),
                radius = 3f
            )
        )
    }

    drawScope.apply {
        drawPath(tonguePath, RedTongue)
        drawPath(tongueHighlight, Color.White.copy(alpha = 0.1f))
    }
}

fun Tooth(drawScope: DrawScope){
    val toothPath = Path().apply {
        moveTo(106f, 97f)
        lineTo(102f, 97f)
        cubicTo(100.9f, 97f, 100f, 96.1f, 100f, 95f)
        lineTo(100f, 93f)
        lineTo(108f, 93f)
        lineTo(108f, 95f)
        cubicTo(108f, 96.1f, 107.1f, 97f, 106f, 97f)
        close()
    }

    drawScope.apply {
        drawPath(toothPath, Color.White)
    }

}

fun MouthOutline(drawScope: DrawScope){
    val mouthOutlinePath = Path().apply {
        moveTo(100.2f, 101f)
        cubicTo(99.8f, 101f, 98.8f, 101f, 98.4f, 101f)
        cubicTo(95.5f, 100.7f, 92.9f, 99.9f, 90.2f, 98.5f)
        cubicTo(89.5f, 98.2f, 89.3f, 97.3f, 89.6f, 96.7f)
        cubicTo(89.8f, 96.2f, 90.3f, 96f, 90.8f, 96f)
        cubicTo(91f, 96f, 91.3f, 96.1f, 91.4f, 96.2f)
        cubicTo(94.4f, 97.7f, 97.2f, 98.5f, 100.2f, 98.5f)
        cubicTo(103.2f, 98.5f, 106f, 97.7f, 108.9f, 96.2f)
        cubicTo(109.1f, 96.1f, 109.4f, 96f, 109.6f, 96f)
        cubicTo(110.1f, 96f, 110.6f, 96.3f, 110.8f, 96.7f)
        cubicTo(111.5f, 97.4f, 111.3f, 98.3f, 110.6f, 98.7f)
        cubicTo(107.9f, 100.1f, 105.2f, 100.9f, 102.5f, 101.2f)
        cubicTo(102.1f, 101.2f, 100.9f, 101.2f, 100.6f, 101.2f)
        close()
    }

    drawScope.apply {
        drawPath(
            path = mouthOutlinePath,
            color = BlueOutline,
            style = Stroke(width = strokeWidth, cap = StrokeCap.Round, join = StrokeJoin.Round)
        )
    }

}

@Preview
@Composable
fun MouthPreview() {
    Canvas(modifier = Modifier.size(100.dp)){
        Mouth(drawScope = this)
    }
}

@Preview()
@Composable
fun MouthBackgroundPreview() {
    Canvas(modifier = Modifier.size(100.dp)) {
        MouthBackground(drawScope = this)
    }
}

@Preview
@Composable
fun MouthSmallBackgroundPreview() {
    Canvas(modifier = Modifier.size(100.dp)){
        MouthSmallBackground(drawScope = this)
    }
}

@Preview
@Composable
fun MouthMediumBackgroundPreview() {
    Canvas(modifier = Modifier.size(100.dp)){
        MouthMediumBackground(drawScope = this)
    }
}

@Preview
@Composable
fun MouthLargeBackgroundPreview() {
    Canvas(modifier = Modifier.size(100.dp)){
        MouthLargeBackground(drawScope = this)
    }
}

@Preview
@Composable
fun TonguePreview() {
    Canvas(modifier = Modifier.size(100.dp)){
        Tongue(drawScope = this)
    }
}

@Preview
@Composable
fun ToothPreview() {
    Canvas(modifier = Modifier.size(100.dp)){
        Tooth(drawScope = this)
    }
}

@Preview
@Composable
fun MouthOutlinePreview() {
    Canvas(modifier = Modifier.size(100.dp)){
        MouthOutline(drawScope = this)
    }
}