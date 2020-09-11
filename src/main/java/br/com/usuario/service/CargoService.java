package br.com.usuario.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.usuario.entidade.Cargo;
import br.com.usuario.entidade.Endereco;
import br.com.usuario.repository.CargoRepository;

@Service
public class CargoService {
	@Autowired
	private CargoRepository repository;

	public Cargo buscarCargo(Long id) {
		Cargo op = repository.findById(id).orElse(null);
		if (op != null) {
			return op;
		} else { 
			return null;
		}
	}
	
	public List<Cargo> listarTodos(){
		return repository.findAll();
	}
	
	public String exculirCargo(Long id) {
		Cargo op = repository.findById(id).orElse(null);
		if(op != null) {
			repository.deleteById(id);
			return "Cargo excluido com sucesso";
		}else {
			return "Cargo não encontrado";
		}
		
	}
	
	public void cadastrarCargo(Cargo CEO) {
		repository.save(CEO);
	}
			
}

