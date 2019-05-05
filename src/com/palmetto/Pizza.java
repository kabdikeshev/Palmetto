package com.palmetto;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Pizza {
    String name;
    String type;
    int count;
    private List<IngredientsEnum> ingredientsSet = new ArrayList<IngredientsEnum>();

    public void addIngredient(IngredientsEnum ingredientsEnum){
        boolean isUnique = true;

        if (ingredientsSet.size() >= 7) {
            System.out.println("Ошибка при попытке добавить ингридиент! Пицца переполнена!");
        } else {
            for (int i = 0 ; i < ingredientsSet.size(); i++) {
                if (ingredientsSet.get(i).name().equals(ingredientsEnum.name())) {
                    isUnique = false;
                    System.out.println("Проверьте повторно ваш заказ! Данный ингридиент уже имеется в пицце");
                }
            }
            if (isUnique) {
                ingredientsSet.add(ingredientsEnum);
            }
        }

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public List<IngredientsEnum> getIngredientsSet() {
        return ingredientsSet;
    }

    public void setIngredientsSet(List<IngredientsEnum> ingredientsSet) {
        this.ingredientsSet = ingredientsSet;
    }
}