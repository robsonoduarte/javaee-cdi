package br.com.mystudies.cdi.appender;
import static java.util.Arrays.asList;
import static org.hamcrest.Matchers.hasSize;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.when;
import static org.mockito.MockitoAnnotations.initMocks;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;

import br.com.mystudies.cdi.domain.Data;
import br.com.mystudies.cdi.domain.NotaFiscal;

public class AppenderNFeItens {


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
		appender = new AppenderItens();
		initMocks(this);
	}




	@Test
	public void test() {

		data.itens = asList("item 1", "item 2", "item 3");

		when(appenderReference.append(notaFiscal, data)).thenReturn(notaFiscal);

		notaFiscal = appender.append(notaFiscal, data);

		assertThat(notaFiscal.itens, hasSize(3));

	}
















}
