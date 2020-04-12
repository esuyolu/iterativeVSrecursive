package org.esmasuyolu.app;

import java.io.PrintStream;

public class RecursiveUtil {
    private static final PrintStream ms_out = System.out;

    public static long factorial(int n)
    {
        if (n <= 1)
            return 1;

        return n * factorial(n - 1);
    }

    private static void writeReverse(String str, int i)
    {
        if (i == str.length())
            return;

        writeReverse(str, i + 1);
        ms_out.print(str.charAt(i));
    }

    public static void writeReverse(String s)
    {
        writeReverse(s, 0);
    }

    private static void getReverse(char [] c, int left, int right)
    {
        if (left >= right)
            return;

        char temp;

        temp = c[left];
        c[left] = c[right];
        c[right] = temp;

        getReverse(c, left + 1, right - 1);
    }

    public static String getReverse(String str)
    {
        char [] c = str.toCharArray();

        getReverse(c, 0, c.length - 1);

        return new String(c);
    }

    public static int getFibonacciNumber(int n)
    {
        if (n <= 2)
            return n - 1;

        return getFibonacciNumber(n - 1) + getFibonacciNumber(n - 2);
    }
}
