package com.yanxian.kaguya.ui.theme

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

/** Ketebalan outline standar di seluruh app. */
val NeoBorderWidth = 1.5.dp

/** Radius standar kartu. */
val NeoCardRadius = 20.dp

/**
 * Kartu bergaya "sticker": isi flat + outline tebal berwarna ink.
 * Dipakai untuk kartu, search bar, chip, mini player, dsb.
 */
@Composable
fun Modifier.neoSurface(
    fill: Color = KaguyaAppTheme.colors.card,
    shape: Shape = RoundedCornerShape(NeoCardRadius),
    borderColor: Color = KaguyaAppTheme.colors.border,
    borderWidth: Dp = NeoBorderWidth
): Modifier = this
    .clip(shape)
    .background(fill)
    .border(borderWidth, borderColor, shape)

fun neoStroke(color: Color, width: Dp = NeoBorderWidth) = BorderStroke(width, color)

/**
 * Stiker kecil miring seperti "NEW", "TRENDING", "PLAYING" di desain.
 */
@Composable
fun NeoSticker(
    text: String,
    modifier: Modifier = Modifier,
    background: Color = PopYellow,
    rotation: Float = -6f,
    contentColor: Color = Ink
) {
    val shape = RoundedCornerShape(8.dp)
    Box(
        modifier = modifier
            .rotate(rotation)
            .clip(shape)
            .background(background)
            .border(NeoBorderWidth, Ink, shape)
            .padding(horizontal = 8.dp, vertical = 3.dp),
        contentAlignment = Alignment.Center
    ) {
        Text(
            text = text.uppercase(),
            color = contentColor,
            fontSize = 10.sp,
            fontWeight = FontWeight.Bold,
            letterSpacing = 0.6.sp,
            maxLines = 1,
            softWrap = false
        )
    }
}
