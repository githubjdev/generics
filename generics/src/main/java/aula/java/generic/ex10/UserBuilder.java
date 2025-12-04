package aula.java.generic.ex10;

public class UserBuilder implements Builder<UserModel> {
	private String nome;

	public UserBuilder setNome(String n) {
		nome = n;
		return this;
	}

	public UserModel build() {
		return new UserModel(nome);
	}
}