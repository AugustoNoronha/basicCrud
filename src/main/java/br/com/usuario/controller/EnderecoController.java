package br.com.usuario.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.usuario.entidade.Endereco;
import br.com.usuario.service.EnderecoService;

@RequestMapping("/endereco")
@RestController
public class EnderecoController {
	@Autowired
	private EnderecoService service;

	@GetMapping(value = "/{id}")
	public Endereco buscraEndereco(@PathVariable("id") Long id) {

		Endereco endereco = service.buscarEndereco(id);
		return (endereco);
	}

	@GetMapping(value = "/")
	public List<Endereco> listarTodosEnderecos() {
		return service.listarTodos();
	}

	@DeleteMapping(value = "/{id}")
	public String excluirEndereco(@PathVariable("id") Long id) {
		return service.exculirEndereco(id);
	}

	@PostMapping(value = "/salvar")
	public void cadastrarEndereco(@RequestBody Endereco itutinga) {
		service.cadastrarEndereco(itutinga); 
		
	}
}
