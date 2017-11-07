package com.example.user.wordcounter;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by user on 06/11/2017.
 */

public class TestCalculator {

    WordCountCalculator calculator;

    @Before
    public void setUp() throws Exception {
        calculator = new WordCountCalculator();
    }

    @Test
    public void testNumberOfWords() throws Exception {
        calculator.add("TestWord");
        assertEquals(1, calculator.getWordCountSize());
    }

    @Test
    public void testSeparateWords() throws Exception {
        calculator.separateWords("1 2 3");
        assertEquals(3, calculator.getWordCountSize());
    }

    @Test
    public void testWordFrequencies() throws Exception {
        calculator.separateWords("a a a b b c");
        assertEquals("{a=3, b=2, c=1}", calculator.wordFrequencies().toString());
    }


}


