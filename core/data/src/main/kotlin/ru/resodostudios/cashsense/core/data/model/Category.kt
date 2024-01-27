package ru.resodostudios.cashsense.core.data.model

import ru.resodostudios.cashsense.core.database.model.CategoryEntity
import ru.resodostudios.cashsense.core.model.data.Category

fun Category.asEntity() = iconRes?.let {
    CategoryEntity(
        id = id.toString(),
        title = title.toString(),
        iconRes = it
    )
}