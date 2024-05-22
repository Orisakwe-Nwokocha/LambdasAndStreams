package utils;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class UtilityTest {

    @Test
    public void testNumberOfDigits() {
        String location = "C:\\Users\\DELL\\IdeaProjects\\LambdasAndStreams\\src\\Sample.txt";
        assertEquals(2, Utility.countNumberOfDigitsOf(location));
    }

    @Test
    public void testNumberOfSentences() {
        String location = "C:\\Users\\DELL\\IdeaProjects\\LambdasAndStreams\\src\\Sample2.txt";
        assertEquals(6, Utility.countNumberOfSentencesOf(location));
    }

    @Test
    public void testNumberOfParagraphs() {
        String location = "C:\\Users\\DELL\\IdeaProjects\\LambdasAndStreams\\src\\Sample2.txt";
        assertEquals(3, Utility.countNumberOfParagraphsOf(location));
    }

    @Test
    public void testNumberOfParagraphs2() {
        String location = "C:\\Users\\DELL\\IdeaProjects\\LambdasAndStreams\\src\\Sample3.txt";
        assertEquals(2, Utility.countNumberOfParagraphsOf(location));
    }

    @Test
    public void testNumberOfParagraphs3() {
        String location = "C:\\Users\\DELL\\IdeaProjects\\LambdasAndStreams\\src\\Sample4.txt";
        assertEquals(0, Utility.countNumberOfParagraphsOf(location));
    }

}