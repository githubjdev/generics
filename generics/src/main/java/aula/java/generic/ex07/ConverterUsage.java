package aula.java.generic.ex07;

public class ConverterUsage {
	public static void main(String[] args) {
		User u = new User("Alex", "a@mail.com");
		UserToDTO conv = new UserToDTO();
		UserDTO dto = conv.convert(u);
	}
}
