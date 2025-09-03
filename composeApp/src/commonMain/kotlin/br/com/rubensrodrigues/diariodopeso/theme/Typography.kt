package br.com.rubensrodrigues.diariodopeso.theme

import androidx.compose.material3.Typography
import androidx.compose.runtime.Composable
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import diariodopeso.composeapp.generated.resources.*
import diariodopeso.composeapp.generated.resources.Res
import org.jetbrains.compose.resources.Font

@Composable
fun montserrat() = FontFamily(
    Font(Res.font.Montserrat_Thin, weight = FontWeight.Thin),
    Font(Res.font.Montserrat_ExtraLight, weight = FontWeight.ExtraLight),
    Font(Res.font.Montserrat_Light, weight = FontWeight.Light),
    Font(Res.font.Montserrat_Regular, weight = FontWeight.Normal),
    Font(Res.font.Montserrat_Medium, weight = FontWeight.Medium),
    Font(Res.font.Montserrat_SemiBold, weight = FontWeight.SemiBold),
    Font(Res.font.Montserrat_Bold, weight = FontWeight.Bold),
    Font(Res.font.Montserrat_ExtraBold, weight = FontWeight.ExtraBold),
    Font(Res.font.Montserrat_Black, weight = FontWeight.Black),
)

@Composable
fun typography() = Typography(
    displayLarge = androidx.compose.ui.text.TextStyle(
        fontFamily = montserrat(),
        fontWeight = FontWeight.Medium,
        fontSize = 57.sp,
        lineHeight = 64.sp,
        letterSpacing = (-0.25).sp
    ),
    displayMedium = androidx.compose.ui.text.TextStyle(
        fontFamily = montserrat(),
        fontWeight = FontWeight.Medium,
        fontSize = 45.sp,
        lineHeight = 52.sp
    ),
    displaySmall = androidx.compose.ui.text.TextStyle(
        fontFamily = montserrat(),
        fontWeight = FontWeight.Medium,
        fontSize = 36.sp,
        lineHeight = 44.sp
    ),
    headlineLarge = androidx.compose.ui.text.TextStyle(
        fontFamily = montserrat(),
        fontWeight = FontWeight.Bold,
        fontSize = 32.sp,
        lineHeight = 40.sp
    ),
    headlineMedium = androidx.compose.ui.text.TextStyle(
        fontFamily = montserrat(),
        fontWeight = FontWeight.Bold,
        fontSize = 28.sp,
        lineHeight = 36.sp
    ),
    headlineSmall = androidx.compose.ui.text.TextStyle(
        fontFamily = montserrat(),
        fontWeight = FontWeight.Bold,
        fontSize = 24.sp,
        lineHeight = 32.sp
    ),
    titleLarge = androidx.compose.ui.text.TextStyle(
        fontFamily = montserrat(),
        fontWeight = FontWeight.Medium,
        fontSize = 22.sp,
        lineHeight = 28.sp
    ),
    titleMedium = androidx.compose.ui.text.TextStyle(
        fontFamily = montserrat(),
        fontWeight = FontWeight.Medium,
        fontSize = 16.sp,
        lineHeight = 24.sp,
        letterSpacing = 0.15.sp
    ),
    titleSmall = androidx.compose.ui.text.TextStyle(
        fontFamily = montserrat(),
        fontWeight = FontWeight.Medium,
        fontSize = 14.sp,
        lineHeight = 20.sp,
        letterSpacing = 0.1.sp
    ),
    bodyLarge = androidx.compose.ui.text.TextStyle(
        fontFamily = montserrat(),
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp,
        lineHeight = 24.sp,
        letterSpacing = 0.5.sp
    ),
    bodyMedium = androidx.compose.ui.text.TextStyle(
        fontFamily = montserrat(),
        fontWeight = FontWeight.Normal,
        fontSize = 14.sp,
        lineHeight = 20.sp,
        letterSpacing = 0.25.sp
    ),
    bodySmall = androidx.compose.ui.text.TextStyle(
        fontFamily = montserrat(),
        fontWeight = FontWeight.Normal,
        fontSize = 12.sp,
        lineHeight = 16.sp,
        letterSpacing = 0.4.sp
    ),
    labelLarge = androidx.compose.ui.text.TextStyle(
        fontFamily = montserrat(),
        fontWeight = FontWeight.Medium,
        fontSize = 14.sp,
        lineHeight = 20.sp,
        letterSpacing = 0.1.sp
    ),
    labelMedium = androidx.compose.ui.text.TextStyle(
        fontFamily = montserrat(),
        fontWeight = FontWeight.Medium,
        fontSize = 12.sp,
        lineHeight = 16.sp,
        letterSpacing = 0.5.sp
    ),
    labelSmall = androidx.compose.ui.text.TextStyle(
        fontFamily = montserrat(),
        fontWeight = FontWeight.Medium,
        fontSize = 11.sp,
        lineHeight = 16.sp,
        letterSpacing = 0.5.sp
    ),
)