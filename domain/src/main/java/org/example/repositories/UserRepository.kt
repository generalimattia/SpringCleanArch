package org.example.repositories

import org.example.model.User

interface UserRepository {
    suspend fun getUsersByFirstName(firstName: String): List<User>
}