package hu.elte.tancify;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Spy;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.ui.Model;

import static net.bytebuddy.matcher.ElementMatchers.any;
import static org.mockito.ArgumentMatchers.anyObject;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

@SpringBootTest
public class TancifyControllerTest {

    @Spy
    @InjectMocks
    TancifyController tancifyControllerSpy;
    @Mock
    Model modelMock;

    @Ignore
    @Before
    public void setUp() throws Exception {}

    @Test
    public void testIndex() {
        String index = tancifyControllerSpy.index(modelMock);
        verify(modelMock, times(1)).addAttribute(anyString(), anyObject());
        //Assert.assertEquals(index, anyString());

    }
}
