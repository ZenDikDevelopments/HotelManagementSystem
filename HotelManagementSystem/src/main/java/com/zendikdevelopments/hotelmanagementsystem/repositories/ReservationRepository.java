package com.zendikdevelopments.hotelmanagementsystem.repositories;

import com.zendikdevelopments.hotelmanagementsystem.models.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReservationRepository extends JpaRepository<Reservation, Long> {

}
