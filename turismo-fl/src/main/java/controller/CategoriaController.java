package controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import classes.Categoria;
import service.CategoriaService;

@RestController
@RequestMapping(path="/categoria")

public class CategoriaController {

	
	@Autowired
	private CategoriaService service = new CategoriaService();
	
	
	@GetMapping("/{id}")
	public Categoria pesquisarPorId(@PathVariable Integer id) {
		return service.pesquisarPorId(id.longValue());
	}	
	
	
	@GetMapping("/listarTodos")
	public List<Categoria>listarTodos() {
	List<Categoria> categoria = service.listarTodos();
		return categoria;
	}
}
