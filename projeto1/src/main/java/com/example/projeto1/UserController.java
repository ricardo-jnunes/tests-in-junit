package com.example.projeto1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

	@GetMapping
	@RequestMapping("/users/{id}")
    public UserResponse retornaUsuario(){
        return UserResponse.build(1L, "Nunes", 30);
    }
}
