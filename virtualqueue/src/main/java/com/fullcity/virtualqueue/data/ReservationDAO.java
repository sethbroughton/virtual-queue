package com.fullcity.virtualqueue.data;

import com.fullcity.virtualqueue.model.Account;
import com.fullcity.virtualqueue.model.Reservation;

import java.util.List;

public interface ReservationDAO {
    public Reservation createReservation(Reservation reservation);
    public Reservation updateReservation(Reservation reservation);
    public List<Reservation> getAllReservationsByAccount(Account account);
}
