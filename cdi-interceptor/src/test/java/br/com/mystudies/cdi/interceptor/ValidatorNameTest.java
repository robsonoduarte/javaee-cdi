package br.com.mystudies.cdi.interceptor;

import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import static org.mockito.MockitoAnnotations.initMocks;

import javax.interceptor.InvocationContext;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;

public class ValidatorNameTest {

	
	@InjectMocks
	private ValidatorName validator;
	
	
	
	@Mock
	private InvocationContext context;
	

	@Mock
	private Person person;
	
	
	
	@Before
	public void setUp()throws Exception{
		initMocks(this);
	}


	


	@Test(expected=ValidatorException.class)
	public void shouldThrowsOneValidatorExceptionWhenNameIsNull() throws Exception {
		when(context.getParameters()).thenReturn(new Object[]{person});
		
		validator.valid(context);		
	}
	
	
	
	
	
	
	
	
	
	
	@Test(expected=ValidatorException.class)
	public void shouldThrowsOneValidatorExceptionWhenNameStartWithLowerCase() throws Exception {
		person.name = "robson Duarte";
		when(context.getParameters()).thenReturn(new Object[]{person});
		
		validator.valid(context);		
	}
	
	
	
	
	
	
	
	
	
	@Test()
	public void shouldProccedWhenNameStartWithUpperCase() throws Exception {
		person.name = "Robson Duarte";
		when(context.getParameters()).thenReturn(new Object[]{person});
		
		validator.valid(context);
		
		verify(context).proceed();
	}

	
	
	
	
	
}
