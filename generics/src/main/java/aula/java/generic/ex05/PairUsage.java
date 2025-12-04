package aula.java.generic.ex05;

public class PairUsage {
	public static void main(String[] args) {
		Pair<String, Integer> p = new Pair<>("Alex", 34);
		System.out.println(p.getFirst());
	}
}
