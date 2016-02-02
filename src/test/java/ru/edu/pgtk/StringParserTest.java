package ru.edu.pgtk;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class StringParserTest {

   @Test(expected=IllegalArgumentException.class)
    public void testSplitIntoWordsWithNull() throws Exception {
        List<String> result = StringParser.splitIntoWords(null, false);
        fail("IllegalArgumentException expected, bun nothing happends!");
    }

    @Test
    public void testSplitIntoWordsWithmultipleSpaces() {
        List<String> result = StringParser.splitIntoWords("Hallo     world!", true);
        assertNotNull(result);
        assertTrue(result.size() == 2);
    }

    @Test
    public void testSplitOnlyWords() {
        List<String> result = StringParser.splitIntoWords("Want to be the best - get working!", true);
//        for (String word: result) {
//            System.out.println(word);
//        }
        assertNotNull(result);
        assertTrue(result.size() == 7); // БЕЗ тире!
    }

    @Test
    public void testSplitOnlyWordsAndNotOnlyWords() {
        List<String> result = StringParser.splitIntoWords("Want to be the best - get working!", true);
//        for (String word: result) {
//            System.out.println(word);
//        }
        assertNotNull(result);
        assertTrue(result.size() == 7); // БЕЗ знаков препинания!
        result = StringParser.splitIntoWords("Want to be the best - get working!", false);
//        for (String word: result) {
//            System.out.println(word);
//        }
        assertNotNull(result);
        assertTrue(result.size() == 8); // СО знаками препинания!
    }

    @Test
    public void testJoinWords() {
        List<String> words = new ArrayList<String>();
        words.add("This");
        words.add("is");
        words.add("a");
        words.add("test");
        String result = StringParser.joinWords(words);
        assertEquals("This is a test", result);
    }
}