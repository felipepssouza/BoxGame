package com.gamebox.structure;

import com.boxgame.fruit.Apple;
import com.boxgame.fruit.Fruit;
import com.boxgame.fruit.Orange;
import com.boxgame.structure.FruitBox;
import com.boxgame.structure.Label;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class FruitBoxTest {

    @Test
    public void shouldBuildBoxWithTheSameFruitAndWithPassedLabel(){
        List<Fruit> oranges = Arrays.asList(new Orange(), new Orange());

        FruitBox boxOfOranges = FruitBox.with(oranges).labelledOf(Label.ORANGE);

        assertEquals(2, boxOfOranges.getFruits().size());
        assertEquals(Label.ORANGE, boxOfOranges.getLabel());
        assertTrue(boxOfOranges.getFruits().get(0) instanceof Orange);
        assertTrue(boxOfOranges.getFruits().get(1) instanceof Orange);
    }

    @Test
    public void shouldBuildBoxOfDifferentFruits(){
        List<Fruit> mixed = Arrays.asList(new Orange(), new Apple());

        FruitBox mixedFruitBox = FruitBox.with(mixed).labelledOf(Label.MIX);

        assertEquals(2, mixedFruitBox.getFruits().size());
        assertEquals(Label.MIX, mixedFruitBox.getLabel());
        assertTrue(mixedFruitBox.getFruits().stream().anyMatch(fruit -> fruit instanceof Orange));
        assertTrue(mixedFruitBox.getFruits().stream().anyMatch(fruit -> fruit instanceof Apple));
    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldThrowIllegalArgumentWhenNoneFruitsIsPassed(){
        FruitBox.with(new ArrayList<>());
    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldThrowIllegalArgumentWhenNullIsPassed(){
        FruitBox.with(null);
    }

}
