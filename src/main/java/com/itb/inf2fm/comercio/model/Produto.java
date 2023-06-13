package com.itb.inf2fm.comercio.model;

public class Produto {
	
	private Long id;
	private String nome;
	private String descricao;
	private String codigobarras;
	private Double preco;
	 
	//public : Acesso liberado para todas as classes.
	//private: Acesso permitido apenas para os membros.
	//		   da propria classe.
	//		   Entende-se por membros (atributos e ou métodos)

	//Método Setter's e Getter's: atribuir e recuperar dados do atributo respectivamente
	
		public void setId(Long id) {
			this.id = id;
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
