package com.redpig.PowerMock;

/**
 * Created by hetao on 2018/11/6.
 */
public class Calculator {

    public int calc(int start, int end)
    {
        logInfo(start, end);
        if(CheckUtil.check(start, end))
        {
            return calcFunc(start, end);
        }
        return 0;
    }

    private int calcFunc(int start, int end)
    {
        int sum = 0;
        for(int i = start; i<=end; i++)
        {
            sum += i;
        }
        return sum;
    }

    public void logInfo(int start, int end)
    {
        System.out.println("start:" + start + ", end:" + end);
    }
}
