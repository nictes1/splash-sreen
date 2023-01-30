package com.nictes.splashscreen

import android.graphics.Color.parseColor
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.key
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.input.key.Key
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import com.nictes.splashscreen.navigation.AppScreens
import com.nictes.splashscreen.ui.theme.SplashScreenTheme
import kotlinx.coroutines.delay


@Composable
fun SplashScreen (navController: NavHostController) {
    LaunchedEffect(key1 = true) {
        delay(5000) //wait 5' seconds
        navController.popBackStack()
        navController.navigate(AppScreens.MainScreen.route)
    }

    Splash()
}


@Composable
fun Splash (){
    Column (

        modifier = Modifier
            .fillMaxSize()
            .background(color = "#004aad".color),

        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
    ) {


        Image(
            painter = painterResource(R.drawable.nictes),
            contentDescription = "Logo Nictes",
            modifier = Modifier.fillMaxSize()
        )
    }
}

val String.color
    get() = Color(parseColor(this))

@Preview(showBackground = true)
@Composable
fun SplashScrenPreview() {
    SplashScreenTheme {
        Splash()
    }
}