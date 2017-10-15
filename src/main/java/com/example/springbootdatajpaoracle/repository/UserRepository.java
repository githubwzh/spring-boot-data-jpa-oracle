package com.example.springbootdatajpaoracle.repository;

import com.example.springbootdatajpaoracle.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
