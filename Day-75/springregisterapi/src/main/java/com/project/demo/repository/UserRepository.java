package com.project.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.demo.entity.User;

@Repository //not necessary
public interface UserRepository extends JpaRepository<User, String> {

}
