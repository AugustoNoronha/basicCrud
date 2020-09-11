package br.com.usuario.entidade;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;



	@Entity
	@Table(name = "cargo")
	@Getter
	@Setter
	public class Cargo {

		@Id
		@GeneratedValue(generator = "sq_cargo")
		@Column(name = "id")
		private Long id;

		@Column(name = "nome")
		private String nome;

		@Column(name = "tarefa")
		private String tarefa;

		
		

	}
