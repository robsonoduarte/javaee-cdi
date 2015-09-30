package br.com.mystudies.cdi.interceptor;

import javax.interceptor.AroundInvoke;
import javax.interceptor.Interceptor;
import javax.interceptor.InvocationContext;

@Interceptor
@Validator
public class ValidatorName {

	
	
	
	
	@AroundInvoke
	public Object valid(InvocationContext context) throws Exception {
		return context.proceed();
	}

	
	
	
	
	
	
	
}
