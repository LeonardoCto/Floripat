package classes;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name="categorias")


public class Categoria {

	public Categoria(Long idCategoria, String nome, String descrição) {
		super();
	
	}
	public Categoria() {
		super();
		
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="id")
	private Long idCategoria;
	
	@Column(name="nome")
	private String nome;
	
	@Column(name="descricao")
	private String descricao;
}

