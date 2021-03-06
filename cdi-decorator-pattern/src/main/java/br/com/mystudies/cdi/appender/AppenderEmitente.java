package br.com.mystudies.cdi.appender;

import javax.decorator.Decorator;
import javax.decorator.Delegate;
import javax.inject.Inject;

import br.com.mystudies.cdi.domain.Data;
import br.com.mystudies.cdi.domain.NotaFiscal;

@Decorator
public class AppenderEmitente implements Appender {


	@Inject
	@Delegate
	private Appender appender;


	@Override
	public NotaFiscal append(NotaFiscal notaFiscal, Data data) {
		notaFiscal = appender.append(notaFiscal, data);

		notaFiscal.emitente = data.emitente;

		System.out.println("Appender Emitente - > " + notaFiscal);

		return notaFiscal;
	}

}
