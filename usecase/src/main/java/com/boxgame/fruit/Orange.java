package com.boxgame.fruit;

import com.boxgame.structure.Label;

public class Orange implements Fruit {

    @Override
    public boolean isItYourLabel(Label label) {
        return Label.ORANGE.equals(label);
    }

    @Override
    public Label getLabel() {
        return Label.ORANGE;
    }
}
