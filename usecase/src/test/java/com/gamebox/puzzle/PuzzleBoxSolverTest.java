package com.gamebox.puzzle;

import com.boxgame.puzzle.PuzzleBoxSolver;
import com.boxgame.structure.Label;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PuzzleBoxSolverTest {

    @Test
    public void shouldGetLabelMixToSolveOtherBoxes(){
        Label foundedLabel = new PuzzleBoxSolver().findBoxWithTheLabelThatAnswerOtherLabels();

        assertEquals(Label.MIX, foundedLabel);
    }

}
