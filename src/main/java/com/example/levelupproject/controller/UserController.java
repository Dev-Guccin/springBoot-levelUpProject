package com.example.levelupproject.controller;

import com.example.levelupproject.dto.UserRequest;
import com.example.levelupproject.entity.User;
import com.example.levelupproject.service.UserService;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.persistence.EntityManager;
import javax.validation.Valid;

@RestController
@RequiredArgsConstructor // final이 붙은 객체를 DI해준다.
public class UserController {

    final private UserService userService;

    @PostMapping(path = "/user")
    public ResponseEntity signUp(
            @RequestBody @Valid final UserRequest userRequest
            ){

        User saveduser = userService.addUser(userRequest.getUserId(), userRequest.getPassword(), userRequest.getUsername(), userRequest.getEmail());
        return new ResponseEntity(saveduser, HttpStatus.OK);
    }
    @GetMapping(path = "/user/{id}")
    public ResponseEntity getUser(
            @PathVariable Long id
    ){

        User saveduser = userService.getUser(id);
        return new ResponseEntity(saveduser,HttpStatus.OK);
    }
}
