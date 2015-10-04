package br.com.mystudies.cdi.interceptor;

import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import static org.mockito.MockitoAnnotations.initMocks;

import javax.interceptor.InvocationContext;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;

public class ValidatorTwoTest {

	
	@InjectMocks
	private ValidatorName validator;
	
	
	
	@Mock
	private InvocationContext context;
	

	@Mock
	private Entity Entity;
	
	
	
	@Before
	public void setUp()throws Exception{
		initMocks(this);
	}


	
	@Test
	public void test() throws Exception {
		when(context.getParameters()).thenReturn(new Object[]{});
		validator.valid(context);
		
		verify(context).proceed();
	}

	
	
}