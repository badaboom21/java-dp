package org.sebsy.strategy;

public class StrategyFactory {
    public static Strategy getStrategy(TypeTri typeTri) {
        switch (typeTri) {
            case BUBBLE:
                return new BubbleSort();

            case INSERTION:
                return new InsertionSort();
            case SELECTION:
                return new SelectionSort();
            default:
                throw new IllegalArgumentException(
                        "Type inconnu : " + typeTri
                );

        }
    }
}

/*
*
public static Element creerElement(
            TypeElement type,
            String nom,
            double valeur,
            Unite unite
    ){
        switch (type) {

        case INGREDIENT:
            return new Ingredient(nom, valeur, unite);

        case ALLERGENE:
            return new Allergene(nom, valeur, unite);

        case ADDITIF:
            return new Additif(nom, valeur, unite);

        default:
            throw new IllegalArgumentException(
                    "Type inconnu : " + type
            );
        }
    }
*
*
* */