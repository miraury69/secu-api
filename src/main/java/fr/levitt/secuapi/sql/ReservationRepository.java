package fr.levitt.secuapi.sql;

import org.springframework.data.repository.CrudRepository;

import fr.levitt.secuapi.core.Reservation;

public interface ReservationRepository extends CrudRepository<Reservation, Integer> {
}

