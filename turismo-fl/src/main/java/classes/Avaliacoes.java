package classes;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name="avaliacoes")

public class Avaliacoes {

	public Avaliacoes(Long idAvaliacoes, Usuario usuario, Experiencias experiencia, Double nota, String comentario, Date data_avaliacao  ) {
		super();
		this.id=idAvaliacoes;
		this.nota=nota;
		this.comentario=comentario;
		this.data_avaliacao=data_avaliacao;
		this.usuario=usuario;
		this.experiencia=experiencia;
	}
	
	public Avaliacoes() {
		super();
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="id", nullable =false)
	private Long idAvaliacoes;
	
	@Column(name="nota", nullable =false)
	private Double nota;
	
	@Column(name="comentario", nullable =false)
	private String comentario;
	
	@Column(name="data_avaliacao", nullable =false)
	private Date data_avaliacao;
	
	@ManyToOne
	@JoinColumn(name="id_usuario", nullable=false)
	private Usuario usuario;
	
	@ManyToOne
	@JoinColumn(name="id_experiencia", nullable =false)
	private Experiencias experiencia;
	
}