package org.sebsy.grasps;

import org.sebsy.grasps.beans.Client;
import org.sebsy.grasps.beans.Reservation;
import org.sebsy.grasps.beans.TypeReservation;
import org.sebsy.grasps.daos.ClientDao;
import org.sebsy.grasps.daos.ClientRepository;
import org.sebsy.grasps.daos.TypeReservationDao;
import org.sebsy.grasps.daos.TypeReservationRepository;
import org.sebsy.grasps.interfaces.ReservationServiceInterface;

import java.time.LocalDateTime;

public class ReservationService implements ReservationServiceInterface {

    /**
     * DAO permettant d'accéder à la table des clients
     */
    private final ClientRepository clientRepository = new ClientDao();

    /**
     * DAO permettant d'accéder à la table des types de réservation
     */
    private final TypeReservationRepository typeReservationRepository = new TypeReservationDao();

    @Override
    public Reservation creerReservation(String dateReservationStr, int nbPlaces, String identifiantClient) {
        LocalDateTime dateReservation = Util.toDate(dateReservationStr);
        Client client = clientRepository.extraireClient(identifiantClient);
        Reservation reservation = new Reservation(dateReservation, nbPlaces, client);
        client.addReservation(reservation);
        // TODO création de la réservation dans le DAO
        return reservation;
    }

    @Override
    public Reservation calculTotal(Reservation reservation,String typeReservationStr) {
        TypeReservation typeReservation = typeReservationRepository.extraireTypeReservation(typeReservationStr);
        Client client = reservation.getClient();
        double nbPlaces = reservation.getNbPlaces();
        double toalCalculer = typeReservation.getMontant() * nbPlaces;

        if(client.isPremium()){
            toalCalculer = toalCalculer * (1 - typeReservation.getReductionPourcent() / 100.0);
        }

        reservation.setTotal(toalCalculer);
        return reservation;
    }
}
