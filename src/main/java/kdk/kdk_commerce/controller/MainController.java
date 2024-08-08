package kdk.kdk_commerce.controller;

import kdk.kdk_commerce.entity.UserEntity;
import kdk.kdk_commerce.model.User;
import kdk.kdk_commerce.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class MainController {

    @Autowired private UserService userService;

    @GetMapping
    public ResponseEntity<List<User>> getAllUsers(@RequestParam(required = false) String query) {
        var userEntities =  UserService.getUsers(user);
        return ResponseEntity.ok(userEntities);
    }

}


