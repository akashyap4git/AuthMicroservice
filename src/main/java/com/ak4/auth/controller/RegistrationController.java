package com.ak4.auth.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import com.ak4.auth.entity.User;
import com.ak4.auth.model.ApiResponse;
import com.ak4.auth.model.RegistrationDTO;
import com.ak4.auth.service.UserService;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
public class RegistrationController {

    @Autowired
    private UserService userService;

    @PostMapping("/register")
    public ApiResponse<User> register(@RequestBody RegistrationDTO user){
        return new ApiResponse<>(HttpStatus.OK.value(), "User Registered successfully.",userService.save(user));
    }

    @GetMapping("/get/{id}")
    public ApiResponse<User> getOne(@PathVariable Long id){
        return new ApiResponse<>(HttpStatus.OK.value(), "User fetched successfully.",userService.findById(id));
    }

    @PutMapping("/update/{id}")
    public ApiResponse<RegistrationDTO> update(@RequestBody RegistrationDTO userDto) {
        return new ApiResponse<>(HttpStatus.OK.value(), "User updated successfully.",userService.update(userDto));
    }

    @DeleteMapping("/delete/{id}")
    public ApiResponse<Void> delete(@PathVariable Long id) {
        userService.delete(id);
        return new ApiResponse<>(HttpStatus.OK.value(), "User deleted successfully.", null);
    }
}
