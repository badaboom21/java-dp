package fr.sdv.state;

public class CommandeEnLivraison implements CommandeEtat{
    Commande commande;

    public CommandeEnLivraison(Commande commande) {
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
        throw new IllegalStateException("la commande est déjà en cours de livraison, l’annulation est impossible");
    }
}
