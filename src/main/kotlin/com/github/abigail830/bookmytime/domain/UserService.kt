package com.github.abigail830.bookmytime.domain

import com.github.abigail830.bookmytime.exception.BizException
import com.github.abigail830.bookmytime.infrastructure.db.UserRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class UserService {

    @Autowired
    private lateinit var userRepository: UserRepository

    fun login(userName: String, password: String) {
        if (!userRepository.valid(userName, password)){
            throw BizException("Incorrect username or password")
        }
    }

}
