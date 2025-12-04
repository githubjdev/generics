package aula.java.generic.ex07;

public class UserToDTO implements Converter<User, UserDTO> {
	public UserDTO convert(User u) {
		return new UserDTO(u.getNome(), u.getEmail());
	}
}