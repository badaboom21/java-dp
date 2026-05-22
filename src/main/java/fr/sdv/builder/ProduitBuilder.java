package fr.sdv.builder;

import java.util.List;

public class ProduitBuilder {

    private String nom;
    private String grade;
    private Categorie categorie ;
    private Marque marque ;
    private List<Ingredient> ingredientList ;
    private List<Allergene> allergeneList;

    public ProduitBuilder(){
    };

    public ProduitBuilder withNom(String nom){
        this.nom = nom;
        return this;
    }
    public ProduitBuilder withGrade(String grade){
        this.grade = grade;
        return this;
    }


    public Produit build(){
        return new Produit(nom, grade);
    }

    public ProduitBuilder appendNom(String nom){
        produit.setNom(nom);
        return this;
    }

    public ProduitBuilder appendGrade(String grade){
        produit.setGrade(grade);
        return this;
    }

    public ProduitBuilder appendCategorie(String categorieStr){
        Categorie categorie = new Categorie(categorieStr);
        produit.setCategorie(categorie);
        return this;
    }

    public ProduitBuilder appendMarque(String marqueStr){
        Marque marque = new Marque(marqueStr);
        produit.setMarque(marque);
        return this;
    }

    public ProduitBuilder appendIngredientList(List<Ingredient> ingredientList){
        produit.setIngredientList(ingredientList);
        return this;
    }

    public ProduitBuilder appendIngredient(Ingredient ingredient){
        produit.addIngredient(ingredient);
        return this;
    }

    public ProduitBuilder appendAllergeneList(List<Allergene> allergeneList){
        produit.setAllergeneList(allergeneList);
        return this;
    }

    public ProduitBuilder appendAllergene(Allergene allergene){
        produit.addAllergene(allergene);
        return this;
    }

    public ProduitBuilder appendAdditifList(List<Additif> additifList){
        produit.setAdditifList(additifList);
        return this;
    }

    public ProduitBuilder appendAdditif(Additif additif){
        produit.addAdditif(additif);
        return this;
    }
}
