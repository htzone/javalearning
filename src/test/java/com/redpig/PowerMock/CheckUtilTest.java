package com.redpig.PowerMock;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

/**
 * Created by hetao on 2018/11/7.
 */
@RunWith(PowerMockRunner.class)
@PrepareForTest({
        CheckUtil.class,
})
public class CheckUtilTest {
    @Test
    public void testMockPrivateStaticMethod() throws Exception
    {
        PowerMockito.mockStatic(CheckUtil.class);
        PowerMockito.when(CheckUtil.check(Mockito.anyInt(), Mockito.anyInt())).thenCallRealMethod();
        PowerMockito.when(CheckUtil.class, "checkFunc", Mockito.anyInt(), Mockito.anyInt()).thenReturn(true);
        boolean result = CheckUtil.check(1, 2);
        Assert.assertEquals(true, result);
    }
}
