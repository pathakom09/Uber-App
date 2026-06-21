package com.rideshare.ride__service.Repository;

import com.rideshare.ride__service.Model.Ride;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RideRepo extends JpaRepository<Ride, String    > {

    List<Ride> findByRiderIdOrderByCreatedAtDesc(String riderId);
}
