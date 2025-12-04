package aula.java.generic.ex08;

public class FactoryUsage {
	public static void main(String[] args) {
		UserFactory f = new UserFactory();
		SimpleUser u = f.create();
	}
}
