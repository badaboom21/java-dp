package fr.sdv.state;

public interface CommandeEtat {
    public void ajouterProduit(Produit p);
    public void payer();
    public void livrer(String adresse);
    public void annuler();
}
