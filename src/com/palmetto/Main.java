package com.palmetto;

import java.util.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner = new Scanner(System.in);
        Pizza margarita = new Pizza();

        while (true) {
            System.out.print("Введите ингредиенты : ");
            String ingredientName = scanner.next();
            switch (ingredientName) {
                case "Pepperoni":
                    margarita.addIngredient(IngredientsEnum.Pepperoni);
                    break;
            }
            for (int i = 0; i < margarita.getIngredientsSet().size(); i++) {
                System.out.println(margarita.getIngredientsSet().get(i).name() + " "
                        + margarita.getIngredientsSet().get(i).getCost());
            }

            System.out.println();
        }

    }
}
