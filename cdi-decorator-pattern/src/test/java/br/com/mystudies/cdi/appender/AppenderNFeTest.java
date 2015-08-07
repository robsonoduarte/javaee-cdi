package br.com.mystudies.cdi.appender;
import org.junit.Before;
import org.junit.Test;

import br.com.mystudies.cdi.domain.Data;
import br.com.mystudies.cdi.domain.NotaFiscal;

public class AppenderNFeTest {



	private Appender appender;





	@Before
	public void setUp() throws Exception {
		appender = new AppenderNFe();
	}




	@Test
	public void test() {
		NotaFiscal nfe = appender.append(new NotaFiscal(), new Data());
	}




}
