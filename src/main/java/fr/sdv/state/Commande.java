package fr.sdv.state;

import java.util.ArrayList;
import java.util.List;

public class Commande {
    private double montant;
    private CommandeEtat etat;
    private List<Produit> produits;
    private String adresse;

    public Commande(){
        this.etat = new CommandeCreation(this);
    }

    public List<Produit> getProduits() {
        return produits;
    }

    public void setProduits(List<Produit> produits) {
        this.produits = produits;
        for(Produit p : produits){
            p.setCommande(this);
        }
    }

    public void addProduit(Produit p) {
        p.setCommande(this);
        if(produits == null){
            produits = new ArrayList<Produit>();
        }
        produits.add(p);
    }

    public double getMontant() {
        return montant;
    }

    public void setMontant(double montant) {
        this.montant = montant;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public void setEtat(CommandeEtat etat) {
        this.etat = etat;
    }

    public void ajouterProduit(Produit p){
        etat.ajouterProduit(p);
    }

    public void payer(){
        etat.payer();
    }

    public void livrer(String adresse){
        etat.livrer(adresse);
    }

    public void annuler(){
        etat.annuler();
    }
}
