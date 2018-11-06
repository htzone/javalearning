package com.redpig.PowerMock;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

/**
 * Created by hetao on 2018/11/6.
 */
@RunWith(PowerMockRunner.class)
@PrepareForTest({
        Calculator.class,
        CheckUtil.class,
})
public class CalculatorTest {

    @Test
    public void testMockPrivateMethod1() throws Exception
    {
        Calculator calculator = PowerMockito.mock(Calculator.class);
        PowerMockito.when(calculator.calc(Mockito.anyInt(), Mockito.anyInt())).thenCallRealMethod();
        PowerMockito.when(calculator, "calcFunc", Mockito.anyInt(), Mockito.anyInt()).thenReturn(1);
        int result = calculator.calc(1, 10);
        Assert.assertEquals(1, result);
    }

    @Test
    public void testMockPrivateMethod2() throws Exception
    {
        Calculator calculator = PowerMockito.spy(new Calculator());
        PowerMockito.when(calculator, "calcFunc", Mockito.anyInt(), Mockito.anyInt()).thenReturn(1);
        int result = calculator.calc(1, 10);
        Assert.assertEquals(1, result);
    }

    @Test
    public void testMockStaticMethod() throws Exception
    {
        PowerMockito.mockStatic(CheckUtil.class);
        PowerMockito.when(CheckUtil.check(Mockito.anyInt(), Mockito.anyInt())).thenReturn(false);
        boolean result = CheckUtil.check(1, 2);
        Assert.assertEquals(true, result);
    }

    @Test
    public void testMockPrivateStaticMethod() throws Exception
    {
        PowerMockito.mockStatic(CheckUtil.class);
        PowerMockito.when(CheckUtil.check(Mockito.anyInt(), Mockito.anyInt())).thenCallRealMethod();
        PowerMockito.when(CheckUtil.class, "checkFunc", Mockito.anyInt(), Mockito.anyInt()).thenReturn(true);
        PowerMockito.doNothing().when(CheckUtil.class, "checkInfo", Mockito.anyInt(), Mockito.anyInt());
        boolean result = CheckUtil.check(1, 2);
        Assert.assertEquals(true, result);
    }
}
