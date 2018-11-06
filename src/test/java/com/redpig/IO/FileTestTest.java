package com.redpig.IO;

import com.redpig.IO.File.FileTest;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

/**
 * Created by hetao on 2018/11/6.
 */
@RunWith(PowerMockRunner.class)
@PrepareForTest(FileTest.class)
public class FileTestTest {

    @Test
    public void test() {
        FileTest fileTest = PowerMockito.mock(FileTest.class);

    }
}
