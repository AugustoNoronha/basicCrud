package br.com.usuario.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.usuario.entidade.Usuario;
import br.com.usuario.repository.UsuarioRepository;

@Service
public class UsuarioService {
	@Autowired
	private UsuarioRepository repository;

	public Usuario buscarUsuario(Long id) {
		Usuario op = repository.findById(id).orElse(null);
		if (op != null) {
			return op;
		} else {
			return null;
		}
	}
	
	public List<Usuario> listarTodos(){
		return repository.findAll();
	}
	
	public String exculirUsuario(Long id) {
		Usuario op = repository.findById(id).orElse(null);
		if(op != null) {
			repository.deleteById(id);
			return "Usuario excluido com sucesso";
		}else {
			return "Usuario não encontrado";
		}
		
	}
	
	public void cadastrarUsuario(Usuario wusuario) {
		repository.save(wusuario);
	}
			
}
