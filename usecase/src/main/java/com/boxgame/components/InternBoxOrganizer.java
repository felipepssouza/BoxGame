package com.boxgame.components;

import com.boxgame.fruit.Apple;
import com.boxgame.fruit.Orange;
import com.boxgame.structure.FruitBox;
import com.boxgame.structure.IncorrectPattern;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static com.boxgame.structure.Label.APPLE;
import static com.boxgame.structure.Label.MIX;
import static com.boxgame.structure.Label.ORANGE;

public class InternBoxOrganizer {

    public List<IncorrectPattern> messBoxes() {
        List<IncorrectPattern> incorrectPatterns = new ArrayList<>();
        incorrectPatterns.add(IncorrectPattern.buildWithBoxes(withOrangeOnMixed()));
        incorrectPatterns.add(IncorrectPattern.buildWithBoxes(withAppleOnMixed()));
        return incorrectPatterns;
    }

    private List<FruitBox> withOrangeOnMixed() {
        List<FruitBox> boxes = new ArrayList<>();
        boxes.add(FruitBox.with(Arrays.asList(new Orange(), new Orange())).labelledOf(APPLE));
        boxes.add(FruitBox.with(Arrays.asList(new Apple(), new Apple())).labelledOf(MIX));
        boxes.add(FruitBox.with(Arrays.asList(new Orange(), new Apple())).labelledOf(ORANGE));
        return Collections.unmodifiableList(boxes);
    }

    //TODO Refactor
    private List<FruitBox> withAppleOnMixed() {
        List<FruitBox> boxes = new ArrayList<>();
        boxes.add(FruitBox.with(Arrays.asList(new Orange(), new Orange())).labelledOf(MIX));
        boxes.add(FruitBox.with(Arrays.asList(new Apple(), new Apple())).labelledOf(ORANGE));
        boxes.add(FruitBox.with(Arrays.asList(new Orange(), new Apple())).labelledOf(APPLE));
        return Collections.unmodifiableList(boxes);
    }

}
