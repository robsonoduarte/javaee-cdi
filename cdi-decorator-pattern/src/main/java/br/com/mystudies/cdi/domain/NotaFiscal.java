package br.com.mystudies.cdi.domain;

import java.util.List;

public class NotaFiscal {

	public String numero;
	public String emitente;
	public String destinatario;
	public List<String> itens;









	@Override
	public String toString() {
		return "NotaFiscal [numero=" + numero + ", emitente=" + emitente + ", destinatario=" + destinatario + ", itens="
				+ itens + "]";
	}


}
