package controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import classes.Experiencias;
import exceptions.CampoInvalidoException;
import seletor.ExperienciasSeletor;
import service.ExperienciasService;

@RestController
@RequestMapping(path= "/experiencias")

//


///

public class ExperienciasController {
	
	@Autowired
	private ExperienciasService service = new ExperienciasService();
	
	@PostMapping("/seletor")
	public List<Experiencias> consultarComFiltros(ExperienciasSeletor seletor){
		return service.consultarComFiltros(seletor);
	}
	
	@PostMapping("/inserir")
	public Experiencias inserir(@RequestBody Experiencias novaExperiencia) throws CampoInvalidoException {
		return service.inserir(novaExperiencia);
	}
	
	@PutMapping("/atualizar")
	public boolean atualizar(@RequestBody Experiencias atualizarExperiencia) throws CampoInvalidoException{
		return service.atualizar(atualizarExperiencia) != null;
	}
	
	@DeleteMapping("/{id}")
	public boolean deletar(@PathVariable int id) {
		return service.excluir(id);
	}
	
	@GetMapping("/{id}")
	public Experiencias pesquisarPorId(@PathVariable Integer id) {
		return service.consultarPorId(id.longValue());
		
	}
	
	@GetMapping("/listarTodos")
	public List<Experiencias> listarTodos(){
		List<Experiencias> experiencias = service.listarTodos();
		return experiencias;
	}

}
