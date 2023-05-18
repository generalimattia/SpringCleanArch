package org.example.extensions

import org.example.entities.UserEntity
import org.example.model.User

fun UserEntity.toUser(): User =
    User(
        userId = userId,
        firstName = firstName,
        lastName = lastName
    )