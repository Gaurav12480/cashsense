package ru.resodostudios.cashsense.feature.settings.navigation

import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.animation.slideInHorizontally
import androidx.compose.animation.slideOutHorizontally
import androidx.compose.material3.ExperimentalMaterial3ExpressiveApi
import androidx.compose.material3.MotionScheme
import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import kotlinx.serialization.Serializable
import ru.resodostudios.cashsense.feature.settings.LicensesScreen

@Serializable
object LicensesRoute

fun NavController.navigateToLicenses() = navigate(LicensesRoute) {
    launchSingleTop = true
}

@OptIn(ExperimentalMaterial3ExpressiveApi::class)
fun NavGraphBuilder.licensesScreen(
    motionScheme: MotionScheme,
    onBackClick: () -> Unit,
) {
    composable<LicensesRoute>(
        exitTransition = {
            slideOutHorizontally(motionScheme.fastSpatialSpec()) { -it / 4 } +
                    fadeOut(motionScheme.fastEffectsSpec())
        },
        enterTransition = {
            slideInHorizontally(motionScheme.fastSpatialSpec()) { it / 4 } +
                    fadeIn(motionScheme.fastEffectsSpec())
        },
    ) {
        LicensesScreen(
            onBackClick = onBackClick,
        )
    }
}