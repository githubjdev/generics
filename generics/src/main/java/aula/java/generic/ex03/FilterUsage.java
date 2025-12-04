package aula.java.generic.ex03;

public class FilterUsage {
	public static void main(String[] args) {
		StartsWithFilter f = new StartsWithFilter("A");
		System.out.println(f.apply("Alex"));
	}
}
