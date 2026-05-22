package fr.sdv.state;

public class CommandeAnnulee implements CommandeEtat{

    Commande commande;

    public CommandeAnnulee(Commande commande) {
        this.commande = commande;
    }

    @Override
    public void ajouterProduit(Produit p) {
    }

    @Override
    public void payer() {

    }

    @Override
    public void livrer(String adresse) {

    }

    @Override
    public void annuler() {
        throw new IllegalStateException("La commande a déjà été annulée.");
    }
}
