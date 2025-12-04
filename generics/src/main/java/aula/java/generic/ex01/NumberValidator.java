package aula.java.generic.ex01;

public class NumberValidator implements Validator<Integer> {
	public boolean isValid(Integer n) {
		return n != null && n > 0;
	}
}