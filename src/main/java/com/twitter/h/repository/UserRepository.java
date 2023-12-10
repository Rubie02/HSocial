package com.twitter.h.repository;

import com.twitter.h.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Long> {

    public User findUserByEmail(String email);

    public List<User> searchDistinctByFullNameOrEmail(@Param("query") String query);
}
