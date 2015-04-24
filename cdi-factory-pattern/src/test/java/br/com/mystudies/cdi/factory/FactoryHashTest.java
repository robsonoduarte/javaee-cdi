package br.com.mystudies.cdi.factory;

import static br.com.mystudies.cdi.factory.Algorithm.MD5;
import static org.hamcrest.Matchers.instanceOf;
import static org.junit.Assert.assertThat;
import static org.mockito.Matchers.any;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import static org.mockito.MockitoAnnotations.initMocks;

import javax.enterprise.inject.Instance;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;

import br.com.mystudies.cdi.factory.FactoryHash;
import br.com.mystudies.cdi.hash.Hash;
import br.com.mystudies.cdi.hash.HashMD5;

public class FactoryHashTest {

	
	@InjectMocks
	private FactoryHash factoryHash;

	
	@Mock
	private Instance<Hash> hashInstance;

	
	@Before
	public void setUp() throws Exception {
		factoryHash = new FactoryHash();
		initMocks(this);
	}

	
	@Test
	public void test() {
		
		when(hashInstance.select(any())).thenReturn(hashInstance);
		when(hashInstance.get()).thenReturn(new HashMD5());
		
		assertThat(factoryHash.create(MD5), instanceOf(HashMD5.class));
		
		verify(hashInstance).select(any());
		verify(hashInstance).get();
				
	}
	
}
