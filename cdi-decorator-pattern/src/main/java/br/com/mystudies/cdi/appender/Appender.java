package br.com.mystudies.cdi.appender;
import br.com.mystudies.cdi.domain.Data;
import br.com.mystudies.cdi.domain.NotaFiscal;

public interface Appender {

	NotaFiscal append(NotaFiscal notaFiscal, Data data);

}
