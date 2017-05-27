package br.com.felipe.vo;

public class Orange implements Fruit {

    @Override
    public boolean isItYourLabel(Label label) {
        return Label.ORANGE.equals(label);
    }
}
