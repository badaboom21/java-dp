package fr.sdv.state;

public class CommandePaiement implements CommandeEtat{

    Commande commande;

    public CommandePaiement(Commande commande) {
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
        commande.setAdresse(adresse);
        commande.setEtat(new CommandeEnLivraison(commande));
    }

    @Override
    public void annuler() {
        commande.setEtat(new CommandeAnnulee(commande));
    }
}
