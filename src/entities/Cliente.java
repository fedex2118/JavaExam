package entities;

public class Cliente {

	
	private Long id;
	private String nome;
	private String indirizzo;
	private String email;

	public Cliente() {
		
	}
	
	public Cliente(Long id, String nome, String indirizzo, String email) {
		this.id = id;
		this.nome = nome;
		this.indirizzo = indirizzo;
		this.email = email;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getIndirizzo() {
		return indirizzo;
	}
	public void setIndirizzo(String indirizzo) {
		this.indirizzo = indirizzo;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
}
