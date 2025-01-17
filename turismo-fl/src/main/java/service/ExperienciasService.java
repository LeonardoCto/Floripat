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

	public Experiencias atualizar(Experiencias novaExperiencia) throws CampoInvalidoException {
		validarCamposObrigatorios(novaExperiencia);
		if (novaExperiencia.getId() != null) {
			return experienciasRepository.save(novaExperiencia);
		} else {
			throw new IllegalArgumentException("Não é possível atualizar uma experiência com ID indefinido");
		}
	}

	public boolean excluir(Integer id) {
		this.experienciasRepository.deleteById(id.longValue());
		return true;
	}

	public Experiencias consultarPorId(long id) {
		return experienciasRepository.findById(id).get();
	}

	public List<Experiencias> listarTodos() {
		return (List<Experiencias>) experienciasRepository.findAll();
	}

	public List<Experiencias> consultarComFiltros(ExperienciasSeletor seletor) {
		
		return null;
	}

	private void validarCamposObrigatorios(Experiencias novaExperiencia) throws CampoInvalidoException {
		String mensagemValidacao="";
		

	}
}
