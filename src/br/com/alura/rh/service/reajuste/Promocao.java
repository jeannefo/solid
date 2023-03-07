package br.com.alura.rh.service.reajuste;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Promocao implements Reajuste, ReajusteTributavel{

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

	@Override
	public BigDecimal valorImpostoDeRenda() {
		return valor.multiply(new BigDecimal("0.1"));
	}

	public BigDecimal getValor() {
		return valor;
	}

	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}

	public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}


}
