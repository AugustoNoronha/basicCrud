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

import br.com.usuario.entidade.Cargo;
import br.com.usuario.service.CargoService;

@RequestMapping("/cargo")
@RestController
public class CargoController {
	@Autowired
	private CargoService service;

	@GetMapping(value = "/{id}")
	public Cargo buscraCargo(@PathVariable("id") Long id) {

		Cargo cargo = service.buscarCargo(id);
		return (cargo);
	}

	@GetMapping(value = "/")
	public List<Cargo> listarTodosCargo() {
		return service.listarTodos();
	}

	@DeleteMapping(value = "/{id}")
	public String excluirCargo(@PathVariable("id") Long id) {
		return service.exculirCargo(id);
	}

	@PostMapping(value = "/salvar")
	public void cadastrarCargo(@RequestBody Cargo CEO) {
		service.cadastrarCargo(CEO);

	}
}
