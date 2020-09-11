package br.com.usuario.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.usuario.entidade.Endereco;
import br.com.usuario.entidade.Usuario;
import br.com.usuario.repository.EnderecoRepository;

@Service
public class EnderecoService {
	@Autowired
	private EnderecoRepository repository;

	public Endereco buscarEndereco(Long id) {
		Endereco op = repository.findById(id).orElse(null);
		if (op != null) {
			return op;
		} else { 
			return null;
		}
	}
	
	public List<Endereco> listarTodos(){
		return repository.findAll();
	}
	
	public String exculirEndereco(Long id) {
		Endereco op = repository.findById(id).orElse(null);
		if(op != null) {
			repository.deleteById(id);
			return "Endereço excluido com sucesso";
		}else {
			return "Endereço não encontrado";
		}
		
	}
	
	public void cadastrarEndereco(Endereco itutinga) {
		repository.save(itutinga);
	}
			
}
