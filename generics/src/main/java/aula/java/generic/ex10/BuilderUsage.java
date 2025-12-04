package aula.java.generic.ex10;

public class BuilderUsage {
	public static void main(String[] args) {
		UserModel u = new UserBuilder().setNome("Alex").build();
	}
}
