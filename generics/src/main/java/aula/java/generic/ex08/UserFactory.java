package aula.java.generic.ex08;

public class UserFactory implements Factory<SimpleUser> {
	public SimpleUser create() {
		return new SimpleUser("Novo Usuário");
	}
}