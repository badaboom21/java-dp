package fr.sdv.builder;

import java.util.List;

public class Marque {
    private String nom;
    private List<Produit> produitList;

    public Marque(String nom) {
        this.nom = nom;
    }

    public List<Produit> getProduitList() {
        return produitList;
    }

    public void setProduitList(List<Produit> produitList) {
        this.produitList = produitList;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

}
