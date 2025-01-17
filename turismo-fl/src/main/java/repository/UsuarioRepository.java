package repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import classes.Usuario;

@Repository
public interface UsuarioRepository extends CrudRepository<Usuario, Long> {

}
