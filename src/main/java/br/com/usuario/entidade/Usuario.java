package br.com.usuario.entidade;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

/**
 * @author DELL
 *
 */

@Entity
@Table(name = "usuario")
@Getter
@Setter
public class Usuario {

	@Id
	@GeneratedValue(generator = "sq_usuario")
	@Column(name = "id")
	private Long id;

	@Column(name = "nome")
	private String nome;

	@Column(name = "cpf")
	private String cpf;

	@Column(name = "emial")
	private String email;

	@Column(name = "ativo")
	private Boolean ativo;

	@Column(name = "funcao")
	private String funcao;

	@Column(name = "idade")
	private Integer idade;

	@OneToOne(cascade = CascadeType.ALL)
	private Endereco endereco;
	
	@OneToOne(cascade = CascadeType.ALL)
	private Cargo cargo;

}
