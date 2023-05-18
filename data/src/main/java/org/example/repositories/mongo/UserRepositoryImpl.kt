package org.example.repositories.mongo

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import org.example.entities.UserEntity
import org.example.extensions.toUser
import org.example.model.User
import org.example.repositories.UserRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component

@Component
internal class UserRepositoryImpl @Autowired constructor(
    private val userRepository: MongoUserRepository
) : UserRepository {

    override suspend fun getUsersByFirstName(firstName: String): List<User> = withContext(Dispatchers.IO) {
        userRepository.getByFirstName(firstName).map(UserEntity::toUser)
    }
}