package com.redpig.PowerMock;

import java.util.Arrays;

/**
 * Created by hetao on 2018/11/6.
 */
public class CalculatorUser {

    public int sum1to10(float[] floats)
    {
        Arrays.sort(floats);
        for(float f : floats)
        {
            System.out.println(f+"");
        }
        Calculator calculator = new Calculator();
        return calculator.calc(1, 10);
    }


}
