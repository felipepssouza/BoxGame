package com.boxgame.fruit;

import com.boxgame.structure.Label;

public class Apple implements Fruit {

    @Override
    public boolean isItYourLabel(Label label) {
        return Label.APPLE.equals(label);
    }

    @Override
    public Label getLabel() {
        return Label.APPLE;
    }
}
