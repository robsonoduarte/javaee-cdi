package br.com.mystudies.cdi.interceptor;

import static org.junit.Assert.*;
import static org.mockito.MockitoAnnotations.initMocks;

import javax.interceptor.InvocationContext;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;

public class ValidatorOneTest {

	
	@InjectMocks
	private ValidatorOne validator;
	
	
	
	@Mock
	private InvocationContext context;
	
	
	
	
	@Before
	public void setUp()throws Exception{
		initMocks(this);
	}


	
	@Test
	public void test() {				
		validator.valid(context);
	}

	
	
}
