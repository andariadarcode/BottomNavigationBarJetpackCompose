package com.andariadar.bottomnavigationbarjetpackcompose

sealed class NavigationItem(var route: String, var title: String, var icon: Int) {
    object Favorites : NavigationItem("favorites","Favorites", R.drawable.ic_favorites)
    object Home : NavigationItem("home", "Home", R.drawable.ic_home)
    object Settings : NavigationItem("settings","Settings", R.drawable.ic_settings)
}