package br.com.felipe.vo.vo;

public class Orange implements Fruit {

    @Override
    public boolean isItYourLabel(Label label) {
        return Label.ORANGE.equals(label);
    }
}
