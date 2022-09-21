package dad.codesignal;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class CheckPalindromeTest {
    private TheJourneyBegins tjb;

    @Before
    public void setup() {
        tjb = new TheJourneyBegins();
    }

    @Test
    public void test1() {
        assertEquals(true, tjb.checkPalindrome("aabaa"));
    }

    @Test
    public void test2() {
        assertEquals(false, tjb.checkPalindrome("abac"));
    }

    @Test
    public void test3() {
        assertEquals(true, tjb.checkPalindrome("a"));
    }

    @Test
    public void test4() {
        assertEquals(false, tjb.checkPalindrome("az"));
    }

    @Test
    public void test5() {
        assertEquals(true, tjb.checkPalindrome("abacaba"));
    }
}
