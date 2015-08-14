package br.com.mystudies.cdi.appender;
import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.assertThat;

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
		NotaFiscal notaFiscal = appender.append(new NotaFiscal(), new Data());
		assertThat(notaFiscal.numero, equalTo("0000000001"));
	}




}
