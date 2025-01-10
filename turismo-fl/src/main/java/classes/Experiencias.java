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
@Table(name="experiencas")

public class Experiencias {
	
	
	public Experiencias(Long idExperiencias, String nome, String descricao, String cidade, String estado, String pais, Double preco, Date data, Double avaliacoes, Categoria categoria) {
		super();
		this.idExperiencias = idExperiencias;
		this.nome=nome;
		this.descricao=descricao;
		this.cidade=cidade;
		this.estado=estado;
		this.pais=pais;
		this.preco=preco;
		this.data=data;
		this.avaliacoes=avaliacoes;
		this.categoria=categoria;
		
	}

	public Experiencias() {
		super();
		
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	
	@Column(name="idExperiencias", nullable= false, unique= true )
	private Long idExperiencias;
	
	@Column(name="nome", nullable=false)
	private String nome;
	
	@Column(name="descricao", nullable=false)
	private String descricao;
	
	@Column(name="cidade", nullable=false)
	private String cidade;
	
	@Column(name="estado", nullable=false)
	private String estado;
	
	@Column(name="pais", nullable=false)
	private String pais;
	
	@Column(name="preco", nullable=false)
	private Double preco;
	
	@Column(name="data_criacao", nullable=false)
	private Date data;
	
	@Column(name="media_avaliacao", nullable=false)
	private Double avaliacoes;
	
	@ManyToOne
	@JoinColumn(name = "categoria_id", nullable = false)
	private Categoria categoria;
	
}
