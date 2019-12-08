package com.example.springproject.models;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import javax.persistence.Id;

@Entity
@Table
public class Reembolso implements Serializable {
	//Se precisar que o nome da tabela seja diferente usar essa notação =>> (name="reembolso")	
	private static final long serialVersionUID=1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)	
	private long Id;
	// indicando ao DB que os ids serão criados automaticamente.
	
    private TipoReembolso tipoReembolso;
	
	private EntidadeReembolso entidadeReembolso;
	
	private long userId;
	private BigDecimal valor;
	private Date dataReembolso;	
	
	public long getUserId() {
		return this.userId;
	}
	public void setUserId(long userId) {
		this.userId = userId;
	}
	
	public BigDecimal getValor() {
		return this.valor;
	}
	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}
	public Date getDataReembolso() {
		return this.dataReembolso;
	}
	public void setDataReembolso(Date dataReembolso) {
		this.dataReembolso = dataReembolso;
	}

	public EntidadeReembolso getEntidadeReembolso() {
		return entidadeReembolso;
	}
	public void setEntidadeReembolso(EntidadeReembolso entidadeReembolso) {
		this.entidadeReembolso = entidadeReembolso;
	}
	public TipoReembolso getTipoReembolso() {
		return tipoReembolso;
	}
	public void setTipoReembolso(TipoReembolso tipoReembolso) {
		this.tipoReembolso = tipoReembolso;
	}
		
}
