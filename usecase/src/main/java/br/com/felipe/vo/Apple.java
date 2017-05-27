package br.com.felipe.vo;

public class Apple implements Fruit {

    @Override
    public boolean isItYourLabel(Label label) {
        return Label.APPLE.equals(label);
    }
}
