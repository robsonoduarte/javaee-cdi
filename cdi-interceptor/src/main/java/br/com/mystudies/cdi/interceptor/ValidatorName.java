package br.com.mystudies.cdi.interceptor;

import static java.lang.Character.isLowerCase;
import static org.apache.commons.lang3.StringUtils.isBlank;

import javax.interceptor.AroundInvoke;
import javax.interceptor.Interceptor;
import javax.interceptor.InvocationContext;

@Interceptor
@Validator
public class ValidatorName {

	
	
	
	
	@AroundInvoke
	public Object valid(InvocationContext context) throws Exception {
		
		String name = name(context);
		
		
		if(isBlank(name) || isLowerCase(name.charAt(0))){
			throw new ValidatorException("The name is invalid");
		}
	
		
		return context.proceed();
	}

































	

	
	
	
	
	
	
	
	
	
	
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	private String name(InvocationContext context) {
		return person(context).name;
	}



	private Person person(InvocationContext context) {
		return (Person) context.getParameters()[0];
	}

	
}
