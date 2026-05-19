package fr.sdv.factory;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FactoryTest {

    @Test
    void creerIngredient() {
        Element element = ElementFactory.creerElement(
                TypeElement.INGREDIENT,
                "Farine",
                250,
                Unite.MILLI_GRAMMES
        );

        assertInstanceOf(Ingredient.class, element);
        assertEquals("Farine", element.getNom());
        assertEquals(250, element.getValeur());
        assertEquals(Unite.MILLI_GRAMMES, element.getUnite());
    }

    @Test
    void creerAllergene() {
        Element element = ElementFactory.creerElement(
                TypeElement.ALLERGENE,
                "Gluten",
                10,
                Unite.MILLI_GRAMMES
        );

        assertInstanceOf(Allergene.class, element);
    }

    @Test
    void creerAdditif() {
        Element element = ElementFactory.creerElement(
                TypeElement.ADDITIF,
                "E330",
                5,
                Unite.MICRO_GRAMMES
        );

        assertInstanceOf(Additif.class, element);
    }
}