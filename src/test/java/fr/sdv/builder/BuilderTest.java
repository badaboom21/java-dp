package fr.sdv.builder;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BuilderTest {

    @Test
    void shouldBuildProduitNominalCase() {

        Ingredient tomate = new Ingredient("Tomate", 120);
        Ingredient fromage = new Ingredient("Fromage", 80);
        Additif additif = new Additif("E202", 2);
        Allergene lait = new Allergene("Lait", 5);

        Produit produit = new ProduitBuilder()
                .appendNom("Pizza")
                .appendGrade("A")
                .appendCategorie("Surgelé")
                .appendMarque("Findus")
                .appendIngredient(tomate)
                .appendIngredient(fromage)
                .appendAdditif(additif)
                .appendAllergene(lait)
                .build();

        assertNotNull(produit);

        assertEquals("Pizza", produit.getNom());
        assertEquals("A", produit.getGrade());

        assertEquals("Surgelé",
                produit.getCategorie().getNom());

        assertEquals("Findus",
                produit.getMarque().getNom());

        assertEquals(2,
                produit.getIngredientList().size());

        assertEquals(1,
                produit.getAdditifList().size());

        assertEquals(1,
                produit.getAllergeneList().size());
    }
    @Test
    void shouldCreateProduitWithoutOptionnalLists() {

        Produit produit = new ProduitBuilder()
                .appendNom("Eau")
                .appendGrade("B")
                .appendCategorie("Boisson")
                .appendMarque("Evian")
                .build();

        assertNotNull(produit);

        assertNull(produit.getIngredientList());
        assertNull(produit.getAdditifList());
        assertNull(produit.getAllergeneList());
    }

    @Test
    void shouldBuildProduitWithSeveralIngredients() {

        Ingredient eau = new Ingredient("Eau", 500);
        Ingredient sucre = new Ingredient("Sucre", 25);

        Produit produit = new ProduitBuilder()
                .appendNom("Soda")
                .appendGrade("C")
                .appendCategorie("Boisson")
                .appendMarque("Coca-Cola")
                .appendIngredient(eau)
                .appendIngredient(sucre)
                .build();

        assertNotNull(produit);

        assertEquals("Soda", produit.getNom());
        assertEquals("C", produit.getGrade());
        assertEquals("Boisson", produit.getCategorie().getNom());
        assertEquals("Coca-Cola", produit.getMarque().getNom());

        assertEquals(2, produit.getIngredientList().size());
        assertNull(produit.getAdditifList());
        assertNull(produit.getAllergeneList());
    }

    @Test
    void shouldBuildProduitWithAdditifOnly() {

        Additif additif = new Additif("E330", 3);

        Produit produit = new ProduitBuilder()
                .appendNom("Jus")
                .appendGrade("B")
                .appendCategorie("Boisson")
                .appendMarque("Tropicana")
                .appendAdditif(additif)
                .build();

        assertNotNull(produit);

        assertEquals(1, produit.getAdditifList().size());
        assertNull(produit.getIngredientList());
        assertNull(produit.getAllergeneList());
    }

    @Test
    void shouldBuildProduitWithAllergeneOnly() {

        Allergene gluten = new Allergene("Gluten", 15);

        Produit produit = new ProduitBuilder()
                .appendNom("Pain")
                .appendGrade("B")
                .appendCategorie("Boulangerie")
                .appendMarque("Banette")
                .appendAllergene(gluten)
                .build();

        assertNotNull(produit);

        assertEquals(1, produit.getAllergeneList().size());
        assertNull(produit.getIngredientList());
        assertNull(produit.getAdditifList());


        Produit p = new ProduitBuilder()
                .withNom("Pizza")
                .withGrade("toto")
                .build();
    }
}