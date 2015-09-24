package br.com.mystudies.cdi.interceptor;

import static org.junit.Assert.*;

import javax.interceptor.InvocationContext;

import org.junit.Test;

public class ValidatorOneTest {

	
	
	private ValidatorOne validator;
	
	
	private InvocationContext context;
	
	
	
	
	@Test
	public void test() {
		Object object = validator.valid(context);
	}

	
	
}
