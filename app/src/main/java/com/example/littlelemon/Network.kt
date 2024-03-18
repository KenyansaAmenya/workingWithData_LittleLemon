package com.example.littlelemon

import android.icu.text.CaseMap.Title
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class MenuNetwork(
    // add code here
    val menu: List<MenuItemNetwork>
)

@Serializable
data class MenuItemNetwork(
    // add code here
    @SerialName("id")
    val id: Int,

    @SerialName("title")
    val title: String,

    @SerialName("price")
    val price: Double
) {
    fun toMenuItemRoom() = MenuItemRoom(
        // add code here
        id = id,
        title = title,
        price = price.toDouble() // Assuming price is stored as double in Room
    )
}
