package com.example.springproject.models;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table 
public class TipoReembolso implements Serializable {
	
	private static final long serialVersionUID=1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)	
	private long Id;
	private String Tipo;
	private BigDecimal ValorInicial;
	private BigDecimal ValorFinal;
	private BigDecimal Valor;
	public long getId() {
		return Id;
	}
	public void setId(long id) {
		Id = id;
	}
	public String getTipo() {
		return Tipo;
	}
	public void setTipo(String tipo) {
		Tipo = tipo;
	}
	public BigDecimal getValorInicial() {
		return ValorInicial;
	}
	public void setValorInicial(BigDecimal valorInicial) {
		ValorInicial = valorInicial;
	}
	public BigDecimal getValorFinal() {
		return ValorFinal;
	}
	public void setValorFinal(BigDecimal valorFinal) {
		ValorFinal = valorFinal;
	}
	public BigDecimal getValor() {
		return Valor;
	}
	public void setValor(BigDecimal valor) {
		Valor = valor;
	}
}
