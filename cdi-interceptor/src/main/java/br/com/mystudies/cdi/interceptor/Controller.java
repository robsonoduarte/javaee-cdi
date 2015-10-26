package br.com.mystudies.cdi.interceptor;

import java.io.IOException;

import javax.inject.Inject;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/person")
public class Controller extends HttpServlet {
	
	
	
	
	private static final long serialVersionUID = 1L;

	
	
	
	
	@Inject
	private Service service;
	
	
	
	
	
	
	
	
	public void doPost(HttpServletRequest request, HttpServletResponse response)throws IOException {
		service.save(person(request));
    }


	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	private Person person(HttpServletRequest request) {
		Person p = new Person();
		/*p.age = request.getParameter("age");*/
		p.job = request.getParameter("job");
		p.name =request.getParameter("name");				
		return p;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
