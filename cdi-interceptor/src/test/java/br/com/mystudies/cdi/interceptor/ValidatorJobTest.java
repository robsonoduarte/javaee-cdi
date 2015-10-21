package br.com.mystudies.cdi.interceptor;

import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import static org.mockito.MockitoAnnotations.initMocks;

import javax.interceptor.InvocationContext;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;

public class ValidatorJobTest {

	
	@InjectMocks
	private ValidatorJob validator;
	
	
	
	@Mock
	private InvocationContext context;
	

	
	@Mock
	private Person person;
	
	
	
	
	@Before
	public void setUp()throws Exception{
		initMocks(this);
	}


	
	
	
	@Test(expected=ValidatorException.class)
	public void shouldThrowsOneValidatorExceptionWhenJobIsNotProgrammer() throws Exception {
		
		person.job = "Doctor";
		
		
		when(context.getParameters()).thenReturn(new Object[]{person});
		validator.valid(context);
	
		verify(context).proceed();
	}

	
	
	
	
}
