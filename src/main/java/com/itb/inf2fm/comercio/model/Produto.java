package com.itb.inf2fm.comercio.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="produtos")
public class Produto {
	
	@Id	// PK
	@GeneratedValue(strategy = GenerationType.IDENTITY) // Auto-Incremento
	private Long id;
	private String nome;
	private String descricao;
	private String codigobarras;
	private boolean codStatus; 
	private Double preco;
	 
	//public : Acesso liberado para todas as classes.
	//private: Acesso permitido apenas para os membros.
	//		   da propria classe.
	//		   Entende-se por membros (atributos e ou métodos)

	//Método Setter's e Getter's: atribuir e recuperar dados do atributo respectivamente
	
		public void setId(Long id) {
			this.id = id;
		}
		
		public Boolean getCodStatus() {
			return codStatus;
		}

		public void setCodStatus(Boolean codStatus) {
			this.codStatus = codStatus;
		}

		public Long getId() {
			return id;
		}

		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}

		public String getDescricao() {
			return descricao;
		}

		public void setDescricao(String descricao) {
			this.descricao = descricao;
		}

		public String getCodigobarras() {
			return codigobarras;
		}

		public void setCodigobarras(String codigobarras) {
			this.codigobarras = codigobarras;
		}

		public Double getPreco() {
			return preco;
		}

		public void setPreco(Double preco) {
			this.preco = preco;
		}
		
		
}
