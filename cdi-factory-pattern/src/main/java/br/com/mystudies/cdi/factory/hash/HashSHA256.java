package br.com.mystudies.cdi.factory.hash;

import org.apache.commons.codec.digest.DigestUtils;

import br.com.mystudies.cdi.factory.qualifier.SHA256;


@SHA256
public class HashSHA256 implements Hash {

	@Override
	public String getHash(String string) {
		return DigestUtils.sha256Hex(string);
	}
}
