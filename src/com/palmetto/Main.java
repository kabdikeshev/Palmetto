package com.palmetto;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner = new Scanner(System.in);
        List<IngredientsEnum> usersIngredientList = new ArrayList<>();
        Pizza margarita = new Pizza();

        while (true) {
            System.out.print("Введите ингредиенты : ");
            String ingredientName = scanner.next();
            switch (ingredientName) {
                case "Pepperoni":
                    margarita.addIngredient(IngredientsEnum.Pepperoni);
                    System.out.println("Вывод" + margarita.getIngredientsSet().get(0).name() + margarita.getIngredientsSet().get(0).getCost());
                    break;
            }
        }

    }
}
