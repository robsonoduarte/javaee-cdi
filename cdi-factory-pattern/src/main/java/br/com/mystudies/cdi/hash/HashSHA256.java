package br.com.mystudies.cdi.hash;

import static br.com.mystudies.cdi.factory.Algorithm.SHA256;

import org.apache.commons.codec.digest.DigestUtils;

import br.com.mystudies.cdi.qualifier.HashType;


@HashType(SHA256)
public class HashSHA256 implements Hash {

	@Override
	public String digest(String string) {
		return DigestUtils.sha256Hex(string);
	}
}
