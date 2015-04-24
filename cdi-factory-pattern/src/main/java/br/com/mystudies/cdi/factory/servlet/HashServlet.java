package br.com.mystudies.cdi.factory.servlet;

import static org.apache.commons.lang3.StringUtils.isNotBlank;

import java.io.IOException;
import java.io.PrintWriter;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.mystudies.cdi.factory.Algorithm;
import br.com.mystudies.cdi.factory.FactoryHash;
import br.com.mystudies.cdi.hash.Hash;


@WebServlet("/hash")
public class HashServlet extends HttpServlet {
	
	
	private static final long serialVersionUID = 1L;
       

	@Inject
	private FactoryHash factoryHash;
	
	
	//http://localhost:8080/cdi-factory-pattern/hash?algorithm=MD5&value=@robsonoduarte
	//http://localhost:8080/cdi-factory-pattern/hash?algorithm=SHA1&value=@robsonoduarte
	//http://localhost:8080/cdi-factory-pattern/hash?algorithm=SHA256&value=@robsonoduarte

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {		
	
		Hash hash = factoryHash.create(algorithm(request)) ;
		
		PrintWriter printWriter = response.getWriter();
		printWriter.print(hash.digest(value(request)));		
	}



	




	private Algorithm algorithm(HttpServletRequest request) {
		String algorithm = isNotBlank(request.getParameter("algorithm") ) ? request.getParameter("algorithm") : "MD5" ;
		return Algorithm.valueOf(algorithm);
	}

	
	private String value(HttpServletRequest request) {
		return isNotBlank(request.getParameter("value")) ? request.getParameter("value") : "defualt";
	}
}
