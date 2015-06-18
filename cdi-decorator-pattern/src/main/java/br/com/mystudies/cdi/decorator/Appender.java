package br.com.mystudies.cdi.decorator;

import br.com.mystudies.cdi.domain.NotaFiscal;

interface Appender {

	public NotaFiscal append(NotaFiscal  notaFiscalRequestData);
}
