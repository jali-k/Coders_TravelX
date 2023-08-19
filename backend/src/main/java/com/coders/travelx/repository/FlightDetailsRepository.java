package com.coders.travelx.repository;

import com.coders.travelx.model.FlightDetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FlightDetailsRepository extends JpaRepository<FlightDetail,Long> {


}
