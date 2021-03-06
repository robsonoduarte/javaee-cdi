package br.com.mystudies.cdi.appender;

import javax.decorator.Decorator;
import javax.decorator.Delegate;
import javax.inject.Inject;

import br.com.mystudies.cdi.domain.Data;
import br.com.mystudies.cdi.domain.NotaFiscal;

@Decorator
public class AppenderItens implements Appender {


	@Inject
	@Delegate
	private Appender appender;





	@Override
	public NotaFiscal append(NotaFiscal notaFiscal, Data data) {
		notaFiscal = appender.append(notaFiscal, data);

		notaFiscal.itens = data.itens;

		System.out.println("Appender itens - > " + notaFiscal);

		return notaFiscal;
	}


}
