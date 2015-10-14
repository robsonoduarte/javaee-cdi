package br.com.mystudies.cdi.interceptor;

import javax.interceptor.InvocationContext;

public class ValidatorAge {

	public Object valid(InvocationContext context) throws Exception {
		int age = age(context);


		if(age <= 0){
			throw new ValidatorException("Age is invalid");
		}


		return context.proceed();

	}










































	private int age(InvocationContext context) {
		Person person = (Person) context.getParameters()[0];
		return person.age;
	}











}
