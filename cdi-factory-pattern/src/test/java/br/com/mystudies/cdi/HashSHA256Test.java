package br.com.mystudies.cdi;

import static org.apache.commons.codec.digest.DigestUtils.sha256Hex;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

import org.junit.Before;
import org.junit.Test;

import br.com.mystudies.cdi.hash.Hash;
import br.com.mystudies.cdi.hash.HashSHA256;

public class HashSHA256Test {

	private Hash hash;
	
	@Before
	public void setUp() throws Exception {
		hash = new HashSHA256();
	}

	@Test
	public void test() {				
		assertThat(hash.digest("Robson Duarte"), equalTo(sha256Hex("Robson Duarte")));
	}

}
