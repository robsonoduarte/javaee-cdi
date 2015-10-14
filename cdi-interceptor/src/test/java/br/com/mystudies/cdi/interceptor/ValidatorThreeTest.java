package br.com.mystudies.cdi.interceptor;

import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import static org.mockito.MockitoAnnotations.initMocks;

import javax.interceptor.InvocationContext;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;

public class ValidatorThreeTest {


	@InjectMocks
	private ValidatorAge validator;



	@Mock
	private InvocationContext context;



	@Mock
	private Person person;




	@Before
	public void setUp()throws Exception{
		initMocks(this);
	}








	@Test(expected=ValidatorException.class)
	public void shouldThrowsOneValidatorExceptionWhenAgeIsNegative() throws Exception {
		person.age = -1;
		when(context.getParameters()).thenReturn(new Object[]{person});

		validator.valid(context);
	}







	@Test(expected=ValidatorException.class)
	public void shouldThrowsOneValidatorExceptionWhenAgeIsZero() throws Exception {
		person.age = 0;
		when(context.getParameters()).thenReturn(new Object[]{person});

		validator.valid(context);
	}





	@Test()
	public void shouldThrows() throws Exception {
		person.age = 1;
		when(context.getParameters()).thenReturn(new Object[]{person});

		validator.valid(context);


		verify(context).proceed();
	}



























































}
