package br.com.felipe.vo.vo;

public class Apple implements Fruit {

    @Override
    public boolean isItYourLabel(Label label) {
        return Label.APPLE.equals(label);
    }
}
