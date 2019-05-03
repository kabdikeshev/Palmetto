package com.palmetto;

public enum IngredientsEnum {
    TomatoPaste(1.0),
    Cheese(1.0),
    Salami(1.5),
    Bacon(1.2),
    Garlic(0.3),
    Corn(0.7),
    Pepperoni(0.6),
    Olives(0.5),
    PizzaBase(1.0),
    CalzoneSouce(0.5);

    private double cost;

    IngredientsEnum(double cost) {
        this.cost = cost;
    }

    public double getCost() {
        return cost;
    }
}