package br.unipe.luiz.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 
 */

@Entity
@Table(name="tb_contato")
public class ContatoModel implements Serializable{
	
	private static final long serialVersionUID = -4693586145332946601L;
	@Id
	@GeneratedValue
	private int id;	
	@Column(name="nome")
	private String nome;	
	@Column(name="sobrenome")
	private String sobreNome;	
	@Column(name="telefone")
	private String telefone;	
	@Column(name="email")
	private String email;
	
	private int idade;
	
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSobreNome() {
		return sobreNome;
	}
	public void setSobreNome(String sobreNome) {
		this.sobreNome = sobreNome;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "ContatoModel [id=" + id + ", nome=" + nome + ", sobreNome=" + sobreNome + ", telefone=" + telefone
				+ ", email=" + email + "]";
	}
	
}
