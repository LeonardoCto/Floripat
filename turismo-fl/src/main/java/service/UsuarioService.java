package service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import classes.Usuario;
import repository.UsuarioRepository;


@Service
public class UsuarioService {
	
	
	@Autowired
	UsuarioRepository usuarioRepository;

	public Usuario inserir(Usuario novoUsuario) {
		// TODO Auto-generated method stub
		return null;
	}

	public Object atualizar(Usuario atualizarUsuario) {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean excluir(int id) {
		// TODO Auto-generated method stub
		return false;
	}

	public List<Usuario> listarTodos() {
		// TODO Auto-generated method stub
		return null;
	}

	public Usuario consultarPorId(long longValue) {
		// TODO Auto-generated method stub
		return null;
	}

}
