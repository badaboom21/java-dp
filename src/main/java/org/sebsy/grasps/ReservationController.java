package org.sebsy.grasps;

import org.sebsy.grasps.beans.Client;
import org.sebsy.grasps.beans.Reservation;
import org.sebsy.grasps.beans.TypeReservation;
import org.sebsy.grasps.daos.ClientDao;
import org.sebsy.grasps.daos.TypeReservationDao;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * Controlleur qui prend en charge la gestion des réservations client
 */
public class ReservationController {

    /**
     * Service permettant de créer et accéder aux fontions de Réservation
     */
    private ReservationService reservationService = new ReservationService(new TypeReservationDao(), new ClientDao());

    /**
     * Méthode qui créée une réservation pour un client à partir des informations transmises
     *
     * @param params contient toutes les infos permettant de créer une réservation
     * @return Reservation
     */
    public Reservation creerReservation(Params params) {

        // 1) Récupération des infos provenant de la classe appelante
        String identifiantClient = params.getIdentifiantClient();
        String dateReservationStr = params.getDateReservation();
        String typeReservation = params.getTypeReservation();
        int nbPlaces = params.getNbPlaces();

        // 2) Conversion de la date de réservation en LocalDateTime
        //LocalDateTime dateReservation = Util.toDate(dateReservationStr);

        // 3) Extraction de la base de données des informations client
//        Client client = clientDao.extraireClient(identifiantClient);

        // 4) Extraction de la base de données des infos concernant le type de la réservation
//        TypeReservation type = typeReservationDao.extraireTypeReservation(typeReservation);

        // 5) Création de la réservation
        //Reservation reservation = new Reservation(dateReservation, nbPlaces, client);
        Reservation reservation = reservationService.creerReservation(dateReservationStr, nbPlaces, identifiantClient);
//        reservation.setNbPlaces(nbPlaces);
//        reservation.setClient(client);

        // 6) Ajout de la réservation au client
//        client.getReservations().add(reservation);
//        client.addReservation(reservation);

        // 7) Calcul du montant total de la réservation qui dépend:
        //    - du nombre de places
        //    - de la réduction qui s'applique si le client est premium ou non
        reservation = reservationService.calculTotal(reservation,typeReservation);

        return reservation;
    }
}
