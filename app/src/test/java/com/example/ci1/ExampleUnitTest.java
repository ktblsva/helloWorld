package com.example.ci1;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {

    @Test
    public void addition_isCorrect() {
        assertEquals(4, 2 + 2);
    }

    @Test
    public void testMin() {
        MinMax t = new MinMax();
        assertEquals(t.min(2, 4), 2);
    }

    @Test
    public void testMin1() {
        MinMax m = new MinMax();
        assertEquals(m.min(4, 2), 2);
    }

    @Test
    public void testMax() {
        MinMax m = new MinMax();
        assertEquals(m.max(4, 2), 4);
    }

    @Test
    public void testMax1() {
        MinMax m = new MinMax();
        assertEquals(m.max(2, 4), 4);
    }
}