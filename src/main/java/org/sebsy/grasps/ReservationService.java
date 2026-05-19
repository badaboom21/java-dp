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
    private ClientRepository clientRepository = new ClientDao();

    /**
     * DAO permettant d'accéder à la table des types de réservation
     */
    private TypeReservationRepository typeReservationRepository = new TypeReservationDao();

    public ReservationService(TypeReservationRepository typeReservationRepository,
                              ClientRepository clientRepository) {
        super();
        typeReservationRepository = typeReservationRepository;
        clientRepository = clientRepository;

    }


    public Reservation creerReservation(String dateReservationStr, int nbPlaces, String identifiantClient) {
        LocalDateTime dateReservation = Util.toDate(dateReservationStr);
        Client client = clientRepository.extraireClient(identifiantClient);
        Reservation reservation = new Reservation(dateReservation, nbPlaces, client);
        client.addReservation(reservation);
        return reservation;
    }

    public Reservation calculTotal(Reservation reservation,String typeReservation) {
        TypeReservation type = typeReservationRepository.extraireTypeReservation(typeReservation);
        Client client = reservation.getClient();
        reservation.calculTotal(type,client.isPremium());
        return reservation;
    }
}
