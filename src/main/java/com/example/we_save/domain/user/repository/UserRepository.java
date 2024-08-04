package com.example.we_save.domain.user.repository;

import com.example.we_save.domain.user.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    Boolean existsByPhoneNum(String phoneNum);
}
