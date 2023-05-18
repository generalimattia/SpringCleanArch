package com.example.app

import org.example.usecases.GetUserByFirstNameUseCase
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories
import org.springframework.stereotype.Component

@SpringBootApplication(
    scanBasePackages = [
        "org.example.repositories.mongo",
        "org.example.repositories",
        "org.example.usecases"
    ]
)
@EnableMongoRepositories(basePackages = ["org.example.repositories.mongo"])
@Component
open class SpringCleanArchApplication @Autowired constructor(
    private val getUserByFirstNameUseCase: GetUserByFirstNameUseCase
) {

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            SpringApplication.run(SpringCleanArchApplication::class.java, *args)
        }
    }
}