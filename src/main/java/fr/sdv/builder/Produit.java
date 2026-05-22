package fr.sdv.builder;

import java.util.ArrayList;
import java.util.List;

public class Produit {

    private String nom;
    private String grade;
    private Categorie categorie ;
    private Marque marque ;
    private List<Ingredient> ingredientList ;
    private List<Allergene> allergeneList;
    private List<Additif> additifList;

    public Produit(String nom, String grade) {
        this.nom = nom;
        this.grade = grade;
    }

    public Produit(String nom, String grade, Categorie categorie, Marque marque, List<Ingredient> ingredientList, List<Allergene> allergeneList, List<Additif> additifList) {
        this.nom = nom;
        this.grade = grade;
        this.categorie = categorie;
        this.marque = marque;
        this.ingredientList = ingredientList;
        this.allergeneList = allergeneList;
        this.additifList = additifList;
    }

    public Marque getMarque() {
        return marque;
    }

    public void setMarque(Marque marque) {
        this.marque = marque;
    }

    public List<Ingredient> getIngredientList() {
        return ingredientList;
    }

    public void setIngredientList(List<Ingredient> ingredientList) {
        this.ingredientList = ingredientList;
    }

    public void addIngredient(Ingredient ingredientList) {
        if(this.ingredientList == null){
            this.ingredientList = new ArrayList<Ingredient>();
        }
        this.ingredientList.add(ingredientList);
    }

    public List<Allergene> getAllergeneList() {
        return allergeneList;
    }

    public void setAllergeneList(List<Allergene> allergeneList) {
        this.allergeneList = allergeneList;
    }

    public void addAllergene(Allergene allergene) {
        if(this.allergeneList == null){
            this.allergeneList = new ArrayList<>();
        }
        this.allergeneList.add(allergene);
    }

    public List<Additif> getAdditifList() {
        return additifList;
    }

    public void setAdditifList(List<Additif> additifList) {
        this.additifList = additifList;
    }

    public void addAdditif(Additif additif) {
        if (this.additifList == null) {
            this.additifList = new ArrayList<>();
        }
        this.additifList.add(additif);
    }

    public Categorie getCategorie() {
        return categorie;
    }

    public void setCategorie(Categorie categorie) {
        this.categorie = categorie;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
}
