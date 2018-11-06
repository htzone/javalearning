package com.redpig.PowerMock;

/**
 * Created by hetao on 2018/11/6.
 */
public class CheckUtil {

    public static boolean check(int a, int b)
    {
        checkInfo(a, b);
        return checkFunc(a, b);
    }

    private static boolean checkFunc(int a, int b)
    {
        return a > 0 && b > 0;
    }

    private static void checkInfo(int a, int b)
    {
        System.out.println("check info...");
    }
}
