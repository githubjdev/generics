package aula.java.generic.ex01;

public interface Validator<T> {
	boolean isValid(T value);
}