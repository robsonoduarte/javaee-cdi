package br.com.mystudies.cdi;

import static org.apache.commons.codec.digest.DigestUtils.sha1Hex;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

import org.junit.Before;
import org.junit.Test;

import br.com.mystudies.cdi.hash.Hash;
import br.com.mystudies.cdi.hash.HashSHA1;

public class HashSHA1Test {

	private Hash hash;
	
	@Before
	public void setUp() throws Exception {
		hash = new HashSHA1();
	}

	@Test
	public void test() {				
		assertThat(hash.digest("Robson Duarte"), equalTo(sha1Hex("Robson Duarte")));
	}

}
