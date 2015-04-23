package br.com.mystudies.cdi.factory.qualifier;

import javax.enterprise.util.AnnotationLiteral;

public class SAFXTypeLiteral extends AnnotationLiteral<SAFXType> implements SAFXType {

	private static final long serialVersionUID = 1L;



	private String type;



	public SAFXTypeLiteral(String type) {
		this.type = type;
	}



	@Override
	public String value() {
		return type;
	}

}
