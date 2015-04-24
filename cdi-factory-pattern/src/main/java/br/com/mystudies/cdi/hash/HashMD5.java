package br.com.mystudies.cdi.hash;

import static br.com.mystudies.cdi.factory.Algorithm.MD5;
import static org.apache.commons.codec.digest.DigestUtils.md5Hex;
import br.com.mystudies.cdi.qualifier.HashType;



@HashType(MD5)
public class HashMD5 implements Hash {

	@Override
	public String digest(String string) {
		return md5Hex(string);
	}

}
