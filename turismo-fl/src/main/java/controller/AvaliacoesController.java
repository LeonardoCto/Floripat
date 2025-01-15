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

import classes.Avaliacoes;
import exceptions.CampoInvalidoException;
import service.AvaliacoesService;

@RestController
@RequestMapping(path = "/avaliacoes")

//
public class AvaliacoesController {

	@Autowired
	private AvaliacoesService service = new AvaliacoesService();

	@PostMapping("/inserir")
	public Avaliacoes inserir(@RequestBody Avaliacoes novaAvaliacao) throws CampoInvalidoException {
		return service.inserir(novaAvaliacao);

	}

	@PutMapping("/atualizar")
	public boolean atualizar(@RequestBody Avaliacoes atualizarAvaliacao) throws CampoInvalidoException {
		return service.atualizar(atualizarAvaliacao) != null;
	}

	@DeleteMapping("/{id}")
	public boolean excluir(@PathVariable int id) {
		return service.excluir(id);
	}

	@GetMapping("/listarTodos")
	public List<Avaliacoes> listarTodos() {
		List<Avaliacoes> avaliacoes = service.listarTodos();
		return avaliacoes;
	}

	@GetMapping("/{id}")
	public Avaliacoes pesquisarPorId(@PathVariable Integer id) {
		return service.pesqusarPorId(id.longValue());

	}

}
