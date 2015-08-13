package br.com.mystudies.cdi.appender;
import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.when;
import static org.mockito.MockitoAnnotations.initMocks;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;

import br.com.mystudies.cdi.domain.Data;
import br.com.mystudies.cdi.domain.NotaFiscal;

public class AppenderNFeEmitenteTest {



	@InjectMocks
	private Appender appender;


	@Mock
	private Appender appenderReference;


	@Mock
	private NotaFiscal notaFiscal;


	@Mock
	private Data data;




	@Before
	public void setUp() throws Exception {
		appender = new AppenderEmitente();
		initMocks(this);
	}




	@Test
	public void test() {
		data.emitente = "Robson";

		when(appenderReference.append(notaFiscal, data)).thenReturn(notaFiscal);

		notaFiscal = appender.append(notaFiscal, data);


		assertThat(notaFiscal.emitente, equalTo("Robson"));

	}
















}
