package classes;

import java.sql.Date;

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
@Table(name="usuarios")

public class Usuario {

	public Usuario(Long idUsuario, String nome, String email, String senha, Date data_cadastro) {
		super();
		this.idUsuario = idUsuario;
		this.nome =nome;
		this.email = email;
		this.senha= senha;
		this.data_cadastro = data_cadastro;
		
	}

	public Usuario() {
		super();
	}
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	
	@Column(name="idUsuario")
	private Long idUsuario;
	
	@Column(name = "nome", nullable = false)
	private String nome;
	
	
	@Column(name="email", nullable=false)
	private String email;
	
	@Column(name="senha", nullable=false)
	private String senha;
	
	@Column(name="data_cadastro", nullable= false)
	private Date data_cadastro;
	
	

}
