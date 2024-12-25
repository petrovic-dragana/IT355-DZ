package org.example.service;

import org.example.domain.Reservation;

import java.util.List;

public interface ReservationService {

    List<Reservation> getAll();

    void addReservation(Reservation reservation);
}
