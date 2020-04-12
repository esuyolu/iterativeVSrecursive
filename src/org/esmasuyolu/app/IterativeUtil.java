package org.esmasuyolu.app;

public class IterativeUtil {
    public static long factorial(int n)
    {
        if (n < 0)
            return -1;

        int result = 1;

        for (int i = 2; i <= n; ++i)
            result *= i;

        return result;
    }

    public static void writeReverse(String str)
    {
        int len = str.length();

        while (len-- > 0)
            System.out.print(str.charAt(len));
    }

    public static String getReverse(String str)
    {
        int left = 0;
        int right = str.length() - 1;

        char [] c = str.toCharArray();

        while (left < right) {
            char temp = c[left];
            c[left++] = c[right];
            c[right--] = temp;
        }

        return new String(c);
    }

    public static int getFibonacciNumber(int n)
    {
        int firstVal = 0, secondVal = 1, result = 0;

        for (int i = 3; i <= n; ++i) {
            result = firstVal + secondVal;
            firstVal = secondVal;
            secondVal = result;
        }

        return result;
    }
}
