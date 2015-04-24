package br.com.mystudies.cdi.factory;

import javax.enterprise.inject.Any;
import javax.enterprise.inject.Instance;
import javax.inject.Inject;
import javax.inject.Singleton;

import br.com.mystudies.cdi.hash.Hash;

@Singleton
public class FactoryHash {

	
	@Inject
	@Any
	private Instance<Hash> hashInstance;
	
		
	public Hash create(Algorithm hashType) {
		HashTypeLiteral literal = new HashTypeLiteral(hashType);
		return hashInstance.select(literal).get();
	}

}
