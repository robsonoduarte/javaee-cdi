package br.com.mystudies.cdi;

import static org.apache.commons.codec.digest.DigestUtils.md5Hex;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

import org.junit.Before;
import org.junit.Test;

import br.com.mystudies.cdi.hash.Hash;
import br.com.mystudies.cdi.hash.HashMD5;

public class HashMD5Test {

	private Hash hash;
	
	@Before
	public void setUp() throws Exception {
		hash = new HashMD5();
	}

	@Test
	public void test() {				
		assertThat(hash.digest("Robson Duarte"), equalTo(md5Hex("Robson Duarte")));
	}

}
