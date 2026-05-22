package fr.sdv.composite;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TestComposite {
    @Test
    void testComposite() {
        Service service1 = new Service("DSIN");
        Employe directeur = new Employe("RASPEY","Cécile",10000);
        Employe architecte = new Employe("BECHKAR","Bilel",8000);
        service1.addElements(directeur);
        service1.addElements(architecte);

        Service service2 = new Service("Big Data");
        Employe chefDeServiceData = new Employe("RANMEY","JB",7500);
        Employe concepteur = new Employe("DOE","Jane",3500);
        service2.addElements(chefDeServiceData);
        service2.addElements(concepteur);
        service1.addElements(service2);

        Service service3 = new Service("Java Dev");
        Employe chefDeServiceDev = new Employe("GUINEAU","Kevin",7500);
        Employe leadDev = new Employe("MARTIN","Paul",3500);
        service3.addElements(chefDeServiceDev);
        service3.addElements(leadDev);
        service1.addElements(service3);

        // Calcul salaire du service 3
        double salaireTotal = service3.calculerSalaire();
        assertEquals(salaireTotal, 11000);
        assertNotEquals(salaireTotal, 10000);

        // Calcul du service 2
        salaireTotal = service2.calculerSalaire();
        assertEquals(salaireTotal, 11000);
        assertNotEquals(salaireTotal, 10000);

        // Calcul de tous les services
        salaireTotal = service1.calculerSalaire();
        assertEquals(salaireTotal, 40000);
        assertNotEquals(salaireTotal, 10000);
    }
}
