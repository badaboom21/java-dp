package fr.sdv.state;

import java.util.ArrayList;

public class CommandeCreation implements CommandeEtat{

    Commande commande;

    public CommandeCreation(Commande commande) {
        this.commande = commande;
    }

    @Override
    public void ajouterProduit(Produit p) {
        commande.addProduit(p);
    }

    @Override
    public void payer() {
        double montantTotal = commande.getProduits().size() * 0.5;
        commande.setMontant(montantTotal);
        commande.setEtat(new CommandePaiement(commande));
    }

    @Override
    public void livrer(String adresse) {

    }

    @Override
    public void annuler() {
        commande.setEtat(new CommandeAnnulee(commande));
    }
}
