package org.example.service;

import org.example.domain.Reservation;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ReservationServiceImpl implements ReservationService {
    private List<Reservation> listaRez= new ArrayList<>();
    @Override
    public List<Reservation> getAll() {
        return listaRez;
    }

    @Override
    public void addReservation(Reservation reservation) {
        listaRez.add(reservation);
    }
}
