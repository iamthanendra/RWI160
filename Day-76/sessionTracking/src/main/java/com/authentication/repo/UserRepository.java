package com.authentication.repo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.authentication.model.User;

@Repository //not necessary
public interface UserRepository extends JpaRepository<User, String>{

}