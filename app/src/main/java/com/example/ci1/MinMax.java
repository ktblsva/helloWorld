package com.example.ci1;

public class MinMax {
    /**
     * min function
     * @param a first param
     * @param b second param
     * @return minimum of two
     */
    public int min(int a, int b) {
        return a <= b ? a : b;
    }

    /**
     * max function
     * @param a first param
     * @param b second param
     * @return maximum of two
     */
    public int max(int a, int b) {
        return a >= b ? a : b;
    }
}
