package org.example.usecases

import org.example.model.User
import org.example.repositories.UserRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component

interface GetUserByFirstNameUseCase : suspend (String) -> List<User>

@Component
class GetUserByFirstNameUseCaseImpl @Autowired constructor(
    private val userRepository: UserRepository
) : GetUserByFirstNameUseCase {
    override suspend fun invoke(firstName: String): List<User> = userRepository.getUsersByFirstName(firstName)
}