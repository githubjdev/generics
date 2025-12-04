package aula.java.generic.ex07;

public class User {
	private String nome;
	private String email;

	public User(String n, String e) {
		nome = n;
		email = e;
	}

	public String getNome() {
		return nome;
	}

	public String getEmail() {
		return email;
	}
}