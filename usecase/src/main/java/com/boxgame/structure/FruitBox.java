package com.boxgame.structure;

import com.boxgame.fruit.Fruit;

import java.util.ArrayList;
import java.util.List;

public class FruitBox {

    private List<Fruit> fruits = new ArrayList<>();
    private Label label;

    private FruitBox(){
        super();
    }

    public static FruitBox with(List<Fruit> fruits) {
        if(fruits == null || fruits.isEmpty())
            throw new IllegalArgumentException("Box should not be empty");

        FruitBox fruitBox = new FruitBox();
        fruitBox.fruits.addAll(fruits);
        return fruitBox;
    }

    public FruitBox labelledOf(Label label) {
        this.label = label;
        return this;
    }

    public Label getLabel(){
        return this.label;
    }

    public List<Fruit> getFruits(){
        return fruits;
    }

}
