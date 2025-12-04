package aula.java.generic.ex07;

public interface Converter<T, R> {
	R convert(T source);
}