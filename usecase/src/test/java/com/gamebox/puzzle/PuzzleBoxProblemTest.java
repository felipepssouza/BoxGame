package com.gamebox.puzzle;

import com.boxgame.puzzle.PuzzleBoxProblem;
import com.boxgame.structure.IncorrectPattern;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class PuzzleBoxProblemTest {

    @Test
    public void shouldGetTwoPatternsWithIncorrectBoxes() {
        List<IncorrectPattern> patternOfBoxesIncorrect = new PuzzleBoxProblem().getPatternOfBoxesIncorrect();
        assertEquals(2, patternOfBoxesIncorrect.size());
    }

}
