package org.example.repositories.mongo

import org.example.entities.UserEntity
import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.data.mongodb.repository.Query
import org.springframework.stereotype.Component

internal interface MongoUserRepository : MongoRepository<UserEntity, String> {

    @Query("{firstName:'?0'}")
    fun getByFirstName(name: String): List<UserEntity>
}