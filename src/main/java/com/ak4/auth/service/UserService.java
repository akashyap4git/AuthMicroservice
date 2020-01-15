package com.ak4.auth.service;

import com.ak4.auth.entity.User;
import com.ak4.auth.model.RegistrationDTO;

public interface UserService {

    public User save(RegistrationDTO user);
    
    public void delete(Long id);

    public User findOne(String username);

    public User findById(Long id);

    public RegistrationDTO update(RegistrationDTO userDto);
}
