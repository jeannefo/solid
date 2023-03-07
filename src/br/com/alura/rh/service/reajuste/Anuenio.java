package br.com.alura.rh.service.reajuste;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Anuenio implements Reajuste {

	private LocalDate data;
	private BigDecimal valor;
	
	@Override
	public BigDecimal valor() {
		return valor;
	}

	@Override
	public LocalDate data() {
		return data;
	}
	
}
