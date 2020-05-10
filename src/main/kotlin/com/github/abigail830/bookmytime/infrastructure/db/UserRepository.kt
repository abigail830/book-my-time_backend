package com.github.abigail830.bookmytime.infrastructure.db

import org.springframework.stereotype.Repository

@Repository
class UserRepository {
    fun valid(userName: String, password: String): Boolean {
        return userName == "SaraQian" && password == "123456"
    }

}
