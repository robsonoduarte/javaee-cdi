package br.com.mystudies.cdi.interceptor;

import javax.interceptor.AroundInvoke;
import javax.interceptor.Interceptor;
import javax.interceptor.InvocationContext;

@Validator
@Interceptor
public class ValidatorJob {

	
	
	@AroundInvoke
	public Object valid(InvocationContext context) throws Exception {	
		String job = job(context);
		
		if(!"Programmer".equals(job)){
			throw new ValidatorException("Job should is Programmer");
		}
		
		return context.proceed();
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	private String job(InvocationContext context) {
		return  ((Person) context.getParameters()[0]).job;
	}

	
	
	
	
}
