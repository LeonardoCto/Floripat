package repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import classes.Experiencias;

@Repository

public interface ExperienciasRepository extends CrudRepository<Experiencias, Long> {

}
