package com.sonjatechie.executor.api.repository;

import com.sonjatechie.executor.api.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
}
