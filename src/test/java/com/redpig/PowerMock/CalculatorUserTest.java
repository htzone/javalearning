package com.redpig.PowerMock;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import java.util.Arrays;

/**
 * Created by hetao on 2018/11/6.
 */
@RunWith(PowerMockRunner.class)
@PrepareForTest({CalculatorUser.class})
public class CalculatorUserTest {

    @Test
    public void testSum1to10()
    {
        CalculatorUser calculatorUser = new CalculatorUser();
        int result = calculatorUser.sum1to10(new float[0]);
        Assert.assertEquals(55, result);
    }

    @Test
    public void testMockNew() throws Exception
    {
        CalculatorUser calculatorUser = new CalculatorUser();
        Calculator calculator = PowerMockito.mock(Calculator.class);
        PowerMockito.whenNew(Calculator.class).withNoArguments().thenReturn(calculator);
        PowerMockito.when(calculator.calc(Mockito.anyInt(), Mockito.anyInt())).thenReturn(1);
        int result = calculatorUser.sum1to10(new float[0]);
        Assert.assertEquals(1, result);
    }

    @Test
    public void testMockSystemClass() throws Exception
    {
        CalculatorUser calculatorUser = new CalculatorUser();
        PowerMockito.doNothing().when(Arrays.class, "sort", Mockito.any(float[].class));
        int result = calculatorUser.sum1to10(new float[]{1f, 3f, 2f});
    }
}
