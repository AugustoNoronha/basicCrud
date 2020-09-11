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

import br.com.usuario.entidade.Usuario;
import br.com.usuario.service.UsuarioService;

@RequestMapping("/usuario")
@RestController
public class UsuarioController {
	@Autowired
	private UsuarioService service;

	@GetMapping(value = "/{id}")
	public Usuario buscraUsuario(@PathVariable("id") Long id) {

		Usuario usuario = service.buscarUsuario(id);
		return (usuario);
	}

	@GetMapping(value = "/")
	public List<Usuario> listarTodosUsuarios() {
		return service.listarTodos();
	}

	@DeleteMapping(value = "/{id}")
	public String excluirUsuario(@PathVariable("id") Long id) {
		return service.exculirUsuario(id);
	}
	
	@PostMapping(value = "/salvar")
	public void cadastrarUsuario(@RequestBody Usuario wusuario) {
		service.cadastrarUsuario(wusuario);
	}
}
