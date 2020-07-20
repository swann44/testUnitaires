package org.example;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {

        assertTrue( true );
    }

    @Test
    public void test1() {
        assertEquals("aeiouy", App.uniqueVowels("aeiouy"));
    }

    @Test
    public void test2() {
        assertEquals("", App.uniqueVowels("0"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void test3() {
        App.uniqueVowels(null);
    }

    @Test
    public void test4() {
        assertEquals("aeiouy", App.uniqueVowels("aeijouy"));
    }

}
