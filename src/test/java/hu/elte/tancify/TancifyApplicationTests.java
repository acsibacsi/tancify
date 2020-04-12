package hu.elte.tancify;

import org.junit.Ignore;
import org.junit.jupiter.api.Test;
import org.mockito.Spy;
import org.springframework.boot.test.context.SpringBootTest;

import org.mockito.Mockito;

import static org.mockito.Mockito.doReturn;
import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class TancifyApplicationTests {

	@Spy
	TancifyController tancifyControllerSpy;

	@Test
	public void contextLoads() throws Exception {
		assertThat(tancifyControllerSpy).isNotNull();
	}

	@Ignore
	@Test
	public void testContext() {

	}


}
