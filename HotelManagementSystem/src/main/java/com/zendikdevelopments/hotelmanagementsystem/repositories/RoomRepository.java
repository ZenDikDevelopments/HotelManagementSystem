package com.zendikdevelopments.hotelmanagementsystem.repositories;

import com.zendikdevelopments.hotelmanagementsystem.models.Room;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoomRepository extends JpaRepository<Room, Long> {
}
