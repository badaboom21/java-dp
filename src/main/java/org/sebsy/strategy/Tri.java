package org.sebsy.strategy;

public class Tri {

    public void exec(TypeTri typeTri, Integer[] arr) {
        Strategy strategy = StrategyFactory.getStrategy(typeTri);
        strategy.trier(arr);
    }
}
