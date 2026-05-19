package org.sebsy.grasps.interfaces;

import org.sebsy.grasps.beans.Reservation;

public interface ReservationServiceInterface {

    public Reservation creerReservation(String dateReservationStr, int nbPlaces, String identifiantClient);

    public Reservation calculTotal(Reservation reservation,String typeReservation);
}
