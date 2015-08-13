package br.com.mystudies.cdi.appender;
import br.com.mystudies.cdi.domain.Data;
import br.com.mystudies.cdi.domain.NotaFiscal;

public class AppenderNFe implements Appender {

	@Override
	public NotaFiscal append(NotaFiscal notaFiscal, Data data) {
		return new NotaFiscal();
	}

}
