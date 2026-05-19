package fr.sdv.builder;

import java.util.List;

public class ProduitBuilder {
    private Produit produit;

    public ProduitBuilder(){
        produit = new Produit();
    };

    public Produit getProduit() {
        return produit;
    }

    public ProduitBuilder appendNom(String nom){
        produit.setNom(nom);
        return this;
    }

    public ProduitBuilder appendGrade(String grade){
        produit.setGrade(grade);
        return this;
    }

    public ProduitBuilder appendCategorie(Categorie categorie){
        produit.setCategorie(categorie);
        return this;
    }

    public ProduitBuilder appendMarque(Marque marque){
        produit.setMarque(marque);
        return this;
    }

    public ProduitBuilder appendIngredientList(List<Ingredient> ingredientList){
        produit.setIngredientList(ingredientList);
        return this;
    }

    public ProduitBuilder appendIngredient(Ingredient ingredient){
        produit.setIngredient(ingredient);
        return this;
    }

    public ProduitBuilder appendAllergeneList(List<Allergene> allergeneList){
        produit.setAllergeneList(allergeneList);
        return this;
    }

    public ProduitBuilder appendAllergene(Allergene allergene){
        produit.setAllergene(allergene);
        return this;
    }

    public ProduitBuilder appendAdditifList(List<Additif> additifList){
        produit.setAdditifList(additifList);
        return this;
    }

    public ProduitBuilder appendAdditif(Additif additif){
        produit.setAdditif(additif);
        return this;
    }
}
