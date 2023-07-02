package com.zendikdevelopments.hotelmanagementsystem.repositories;

import com.zendikdevelopments.hotelmanagementsystem.models.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<Address, Long> {
}
