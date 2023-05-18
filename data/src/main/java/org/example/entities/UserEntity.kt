package org.example.entities

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document
import java.util.Date

@Document("users")
data class UserEntity(
    @Id private val id: String,
    val userId: String,
    val firstName: String,
    val lastName: String,
    val birtDate: Date
)
