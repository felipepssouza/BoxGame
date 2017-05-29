package com.boxgame.components;

import com.boxgame.fruit.Fruit;
import com.boxgame.structure.FruitBox;
import com.boxgame.structure.IncorrectPattern;
import com.boxgame.structure.Label;

import java.util.List;
import java.util.stream.Collectors;

public class PuzzleBoxSolver {

    /**
     * Method responsible to find the box with the label that solve the puzzle and find the others boxes label
     * @return
     */
    public Label findBoxWithTheLabelThatAnswerOtherLabels(){
        List<IncorrectPattern> incorrectPatterns = new InternBoxOrganizer().messBoxes();

        for (Label label: Label.values()) {
            boolean isThisLabelOnTheBoxHasOneTypeOfFruit = incorrectPatterns.stream().allMatch(incorrectPattern ->
                    isThisLabelOnTheBoxHasOneTypeOfFruit(label, incorrectPattern.getBoxes()));
            if(isThisLabelOnTheBoxHasOneTypeOfFruit)
                return label;
        }
        throw new IllegalStateException("An error has ocurred, label not found");
    }

    /**
     * Method responsible to check if the label chosen has one type of fruit, if so, it can solve other boxes
     * @param label
     * @param boxes
     * @return
     */
    private boolean isThisLabelOnTheBoxHasOneTypeOfFruit(Label label, List<FruitBox> boxes){
        FruitBox choosenFruit = boxes.stream().filter(box -> label == box.getLabel()).findFirst().get();
        Integer groupOfFruitsSize = choosenFruit.getFruits().stream().
                collect(Collectors.groupingBy(Fruit::getLabel, Collectors.counting())).size();
        if(groupOfFruitsSize > 1){
            return false;
        }
        return true;
    }

}
