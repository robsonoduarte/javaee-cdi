package br.com.mystudies.cdi.interceptor;

import javax.interceptor.InvocationContext;

public class ValidatorJob {

	public void valid(InvocationContext context) {	
		String job = job(context);
		
		if(!"Programmer".equals(job)){
			throw new ValidatorException("Job should is Programmer");
		}
		
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	private String job(InvocationContext context) {
		return  ((Person) context.getParameters()[0]).job;
	}

	
	
	
	
}
