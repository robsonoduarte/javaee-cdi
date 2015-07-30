package br.com.mystudies.cdi.decorator;

import br.com.mystudies.cdi.domain.NotaFiscal;

public interface Appender {

	NotaFiscal append(NotaFiscal notaFiscal);

}
