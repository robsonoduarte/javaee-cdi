package br.com.mystudies.cdi.hash;

import static br.com.mystudies.cdi.factory.Algorithm.SHA1;

import org.apache.commons.codec.digest.DigestUtils;

import br.com.mystudies.cdi.qualifier.HashType;


@HashType(SHA1)
public class HashSHA1 implements Hash {

	@Override
	public String digest(String string) {
		return DigestUtils.sha1Hex(string);
	}
}
