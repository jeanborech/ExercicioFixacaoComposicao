package Entidades;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Cliente {

	private String nome;
	private String email;
	private Date aniversario;
	
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	public Cliente(){
	}

	public Cliente(String nome, String email, Date aniversario) {
		this.nome = nome;
		this.email = email;
		this.aniversario = aniversario;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getAniversario() {
		return aniversario;
	}

	public void setAniversario(Date aniversario) {
		this.aniversario = aniversario;
	}

	@Override
	public String toString() {
		return  nome +" " + (sdf.format(aniversario)) + " - " + email;
	}
}
