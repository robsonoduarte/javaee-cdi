package br.com.mystudies.cdi.process;

import static java.util.Arrays.asList;

import java.io.IOException;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.mystudies.cdi.appender.Appender;
import br.com.mystudies.cdi.domain.Data;
import br.com.mystudies.cdi.domain.NotaFiscal;


@WebServlet("/process")
public class Process extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Inject
	private Appender appender;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		NotaFiscal notafiscal =
				appender.append(new NotaFiscal(), data());

		System.out.println("NotaFiscal after process -> " + notafiscal);
	}





























	private Data data() {
		Data data = new Data();
		data.destinatario = "Robson";
		data.emitente = "Duarte";
		data.itens = asList("Item 1", "Item 2", "Item 3");
		return data;
	}





}
