package br.com.mystudies.cdi.interceptor;

import static java.lang.Character.isLowerCase;

import javax.interceptor.AroundInvoke;
import javax.interceptor.Interceptor;
import javax.interceptor.InvocationContext;

@Interceptor
@Validator
public class ValidatorName {

	
	
	
	
	@AroundInvoke
	public Object valid(InvocationContext context) throws Exception {
		
		Person person = person(context);
		
		
		if(isLowerCase(person.name.charAt(0))){
			throw new ValidatorException("The name is invalid");
		}
	
		
		return context.proceed();
	}

	
	
	
	
	
	
	
	
	
	
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	private Person person(InvocationContext context) {
		return (Person) context.getParameters()[0];
	}

	
}
