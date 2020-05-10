package com.github.abigail830.bookmytime.api

import com.github.abigail830.bookmytime.api.dto.UserDTO
import com.github.abigail830.bookmytime.domain.UserService
import com.github.abigail830.bookmytime.exception.BizException
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/users")
class UserController {

    @Autowired
    private lateinit var userService: UserService

    @PostMapping
    fun login(@RequestBody userDto: UserDTO) {
        if (userDto.userName.isNullOrEmpty() ||
                userDto.password.isNullOrEmpty())
            throw BizException("Missing user name or password")

        userService.login(userDto.userName, userDto.password)
    }
}