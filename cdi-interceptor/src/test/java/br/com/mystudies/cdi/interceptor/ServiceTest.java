package br.com.mystudies.cdi.interceptor;

import static org.mockito.MockitoAnnotations.initMocks;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;

public class ServiceTest {

	@InjectMocks
	private Service service;

	
	@Before
	public void setUp() throws Exception {
		initMocks(this);
	}
	
	
	@Test
	public void test() {
		service.save(new Person());
	}

	
}
