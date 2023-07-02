package com.zendikdevelopments.hotelmanagementsystem.repositories;

import com.zendikdevelopments.hotelmanagementsystem.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
