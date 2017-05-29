package com.boxgame.puzzle;

import com.boxgame.fruit.Apple;
import com.boxgame.fruit.Orange;
import com.boxgame.structure.FruitBox;
import com.boxgame.structure.IncorrectPattern;
import com.boxgame.structure.Label;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static com.boxgame.structure.Label.APPLE;
import static com.boxgame.structure.Label.MIX;
import static com.boxgame.structure.Label.ORANGE;

public class PuzzleBoxProblem {

    /***
     * Method responsible to get list of patterns of incorrect boxes and labels
     * @return
     */
    public List<IncorrectPattern> getPatternOfBoxesIncorrect() {
        List<IncorrectPattern> incorrectPatterns = new ArrayList<>();
        incorrectPatterns.add(IncorrectPattern.buildWithBoxes(withOrangeOnMixed()));
        incorrectPatterns.add(IncorrectPattern.buildWithBoxes(withAppleOnMixed()));
        return incorrectPatterns;
    }

    /***
     * Method responsible to create boxes with incorrect label, with mixed label with oranges
     * @return
     */
    private List<FruitBox> withOrangeOnMixed() {
        return createBoxesWithLabel(APPLE, MIX, ORANGE);
    }

    /***
     * Method responsible to create boxes with incorrect label, with mixed label with apples
     * @return
     */
    private List<FruitBox> withAppleOnMixed() {
        return createBoxesWithLabel(MIX, ORANGE, APPLE);
    }

    /***
     * Method responsible to create boxes with parameters labels
     * @param orangeLabel
     * @param appleLabel
     * @param mixLabel
     * @return
     */
    private List<FruitBox> createBoxesWithLabel(Label orangeLabel, Label appleLabel, Label mixLabel) {
        List<FruitBox> boxes = new ArrayList<>();
        boxes.add(FruitBox.with(Arrays.asList(new Orange(), new Orange())).labelledOf(orangeLabel));
        boxes.add(FruitBox.with(Arrays.asList(new Apple(), new Apple())).labelledOf(appleLabel));
        boxes.add(FruitBox.with(Arrays.asList(new Orange(), new Apple())).labelledOf(mixLabel));
        return Collections.unmodifiableList(boxes);

    }

}
