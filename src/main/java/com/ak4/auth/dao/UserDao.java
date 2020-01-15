package com.ak4.auth.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ak4.auth.entity.User;

@Repository
public interface UserDao extends CrudRepository<User, Long> {

    public User findByUsername(String userName);
}
