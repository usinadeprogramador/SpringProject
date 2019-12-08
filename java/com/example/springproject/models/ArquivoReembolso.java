package com.example.springproject.models;

import java.io.Serializable;
import java.sql.Blob;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class ArquivoReembolso implements Serializable {
	
	private static final long serialVersionUID=1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)	
	private long Id;
	private Date data;
	private Blob arquivo;
	
	public long getId() {
		return Id;
	}
	public void setId(long id) {
		Id = id;
	}
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}
	public Blob getArquivo() {
		return arquivo;
	}
	public void setArquivo(Blob arquivo) {
		this.arquivo = arquivo;
	}
}
