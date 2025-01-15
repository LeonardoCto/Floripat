package service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import classes.Experiencias;
import exceptions.CampoInvalidoException;
import repository.ExperienciasRepository;
import seletor.ExperienciasSeletor;

@Service
public class ExperienciasService {

	@Autowired
	private ExperienciasRepository experienciasRepository;

	public Experiencias inserir(Experiencias novaExperiencia) throws CampoInvalidoException {
		validarCamposObrigatorios(novaExperiencia);
		if (novaExperiencia.getIdExperiencias() == null) {
			return experienciasRepository.save(novaExperiencia);

		} else {
			throw new IllegalArgumentException("Não é possível inserir uma experiência com um id já definido.");

		}
	}

	public Object atualizar(Experiencias atualizarExperiencia) {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean excluir(int id) {
		// TODO Auto-generated method stub
		return false;
	}

	public Experiencias consultarPorId(long longValue) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Experiencias> listarTodos() {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Experiencias> consultarComFiltros(ExperienciasSeletor seletor) {
		// TODO Auto-generated method stub
		return null;
	}

	private void validarCamposObrigatorios(Experiencias novaExperiencia) {
		// TODO Auto-generated method stub

	}
}
