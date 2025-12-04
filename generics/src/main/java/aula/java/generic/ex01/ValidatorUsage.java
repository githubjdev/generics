package aula.java.generic.ex01;

public class ValidatorUsage {
	public static void main(String[] args) {
		Validator<String> emailVal = new EmailValidator();
		System.out.println(emailVal.isValid("alex@email.com"));

		Validator<Integer> numberVal = new NumberValidator();
		System.out.println(numberVal.isValid(10));
	}
}
