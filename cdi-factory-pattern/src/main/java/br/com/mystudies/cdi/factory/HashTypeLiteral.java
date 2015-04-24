package br.com.mystudies.cdi.factory;

import javax.enterprise.util.AnnotationLiteral;

import br.com.mystudies.cdi.qualifier.HashType;

public class HashTypeLiteral extends AnnotationLiteral<HashType> implements HashType{

	
	private static final long serialVersionUID = 1L;
	
	
	private Algorithm algorithm;
	
		
	public HashTypeLiteral(Algorithm algorithm) {
		this.algorithm = algorithm;
	}


	@Override
	public Algorithm value() {
		return algorithm;
	}

}
