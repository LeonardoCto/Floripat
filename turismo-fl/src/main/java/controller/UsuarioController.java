package controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import classes.Usuario;
import exceptions.CampoInvalidoException;
import service.UsuarioService;

@RestController
//rotas para comunicação
//

//

public class UsuarioController {
	
	@Autowired
	private UsuarioService service = new UsuarioService();
	
	
	@PostMapping("/inserir")
	public Usuario inserir(@RequestBody Usuario novoUsuario) throws CampoInvalidoException{
		return service.inserir(novoUsuario);
		
	}
	
	@PutMapping("/atualizar")
	public boolean atualizar(@RequestBody Usuario atualizarUsuario) throws CampoInvalidoException{
		return service.atualizar(atualizarUsuario) != null;
		
	}
	
	@DeleteMapping("/{id}")
	public boolean excluir(@PathVariable int id) {
		return service.excluir(id);
		
	}
	
	@GetMapping("/listarTodos")
	public List<Usuario> listarTodos(){
		List<Usuario> usuarios = service.listarTodos();
		return usuarios;
	}
	
	@GetMapping("/{id}")
	public Usuario pesquisarPorId(@PathVariable Integer id) {
		return service.consultarPorId(id.longValue());
		
	}
}
