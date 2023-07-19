package com.zendikdevelopments.hotelmanagementsystem.repositories;

import com.zendikdevelopments.hotelmanagementsystem.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
