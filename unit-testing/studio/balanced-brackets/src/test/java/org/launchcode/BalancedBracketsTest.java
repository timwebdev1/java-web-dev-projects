package org.launchcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BalancedBracketsTest {
    //TODO: add tests here
    @Test
    public void onlyBracketsReturnTrue() {
        String message = "a single pair of balanced brackets returns true";
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"), message);
    }
    @Test
    public void singleBracketsBeforeOtherCharacters() {
        String message = "balanced brackets before other characters returns true";
        String testData = "[]LaunchCode";
        boolean result = BalancedBrackets.hasBalancedBrackets(testData);
        assertTrue(result, message);
    }
    @Test
    public void singleBracketsAroundCharacters() {
        String message = "balanced brackets around characters returns true";
        String testData = "[LaunchCode]";
        boolean result = BalancedBrackets.hasBalancedBrackets(testData);
        assertTrue(result, message);
    }
    @Test
    public void singleBracketsAfterCharacters() {
        String message = "balanced brackets after characters returns true";
        String testData = "LaunchCode[]";
        boolean result = BalancedBrackets.hasBalancedBrackets(testData);
        assertTrue(result, message);
    }
    @Test
    public void multipleConsecutiveBrackets() {
        String message = "multiple consecutive balanced brackets returns true";
        String testData = "[][][]";
        boolean result = BalancedBrackets.hasBalancedBrackets(testData);
        assertTrue(result, message);
    }
@Test
public void multipleNestedBrackets() {
        String message = "multiple nested balanced brackets returns true";
        String testData = "[[[]]]";
        boolean result = BalancedBrackets.hasBalancedBrackets(testData);
        assertTrue(result, message);
}
@Test
public void singleOpeningBracket() {
        String message = "single opening bracket returns false";
        String testData = "[";
        boolean result = BalancedBrackets.hasBalancedBrackets(testData);
        assertFalse(result, message);
}
@Test
public void singleClosingBracket() {
        String message = "single closing bracket returns false";
        String testData = "]";
        boolean result = BalancedBrackets.hasBalancedBrackets(testData);
        assertFalse(result, message);
}
@Test
public void reversedBrackets() {
        String message = "reversed brackets returns false";
        String testData = "][";
        boolean result = BalancedBrackets.hasBalancedBrackets(testData);
        assertFalse(result, message);
}
@Test
public void unbalancedBracketsAmongOtherCharacters() {
        String message = "unbalanced brackets among other characters returns false";
        String testData = "Launch]Code[";
        boolean result = BalancedBrackets.hasBalancedBrackets(testData);
        assertFalse(result, message);
}
@Test
public void mixOfUnbalanacedBrackets() {
        String message = "mix of unbalanced brackets returns false";
        String testData = "[[][[]";
        boolean result = BalancedBrackets.hasBalancedBrackets(testData);
        assertFalse(result, message);
}
@Test
public void stringOfCharactersWithoutBrackets() {
        String message = "string of characters without brackets returns true";
        String testData = "LaunchCode";
        boolean result = BalancedBrackets.hasBalancedBrackets(testData);
        assertTrue(result, message);
}



    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }
}