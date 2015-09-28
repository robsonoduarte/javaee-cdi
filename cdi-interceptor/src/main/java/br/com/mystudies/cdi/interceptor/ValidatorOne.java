package br.com.mystudies.cdi.interceptor;

import javax.interceptor.AroundInvoke;
import javax.interceptor.Interceptor;
import javax.interceptor.InvocationContext;

@Interceptor
@Validator
public class ValidatorOne {

	
	
	
	
	@AroundInvoke
	public Object valid(InvocationContext context) {
		return null;
	}

	
	
	
	
	
	
	
}
