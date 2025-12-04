package aula.java.generic.ex03;

public interface Filter<T> {
	boolean apply(T item);
}