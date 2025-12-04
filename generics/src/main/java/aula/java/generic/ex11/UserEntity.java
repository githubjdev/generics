package aula.java.generic.ex11;

public class UserEntity {
	private Integer id;
	private String nome;

	public UserEntity(Integer i, String n) {
		id = i;
		nome = n;
	}

	public Integer getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}
}