package aula.java.generic.ex01;

public class EmailValidator implements Validator<String> {
	public boolean isValid(String email) {
		return email != null && email.contains("@");
	}
}