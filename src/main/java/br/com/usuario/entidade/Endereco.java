package br.com.usuario.entidade;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;



	@Entity
	@Table(name = "endereco")
	@Getter
	@Setter
	public class Endereco {

		@Id
		@GeneratedValue(generator = "sq_endereco")
		@Column(name = "id")
		private Long id;

		@Column(name = "endereco")
		private String endereco;

		@Column(name = "rua")
		private String rua;

		@Column(name = "cidade")
		private String cidade;

		@Column(name = "estado")
		private String estado;

		@Column(name = "cep")
		private String cep;

		@Column(name = "complemento")
		private String complemento;

		@Column(name = "numero")
		private String numero;
		
		

	}


