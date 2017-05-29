package com.boxgame.structure;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class IncorrectPattern {

    List<FruitBox> boxes = new ArrayList<>();

    private IncorrectPattern(){
        super();
    }

    public static IncorrectPattern buildWithBoxes(List<FruitBox> boxes){
        IncorrectPattern incorrectPattern = new IncorrectPattern();
        incorrectPattern.boxes.addAll(boxes);
        return incorrectPattern;
    }

    public List<FruitBox> getBoxes(){
        return Collections.unmodifiableList(this.boxes);
    }

}
