package com.smartcontact.smartcontact.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.smartcontact.smartcontact.entities.User;

public interface UserRepository extends JpaRepository<User, Integer> {

}