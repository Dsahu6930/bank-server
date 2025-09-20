package com.example.springboottutorial;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.springboottutorial.User;

public interface UserRepository extends JpaRepository<User, Long> {
}
