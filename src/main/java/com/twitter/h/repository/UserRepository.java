package com.twitter.h.repository;

import com.twitter.h.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Long> {

    public User findUserByEmail(String email);
    public List<User> searchUserByEmailAndFullName(String email, String fullName);
}
