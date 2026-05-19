package org.sebsy.grasps.daos;

import org.sebsy.grasps.beans.TypeReservation;

public interface TypeReservationRepository {
    public TypeReservation extraireTypeReservation(String type);
}
