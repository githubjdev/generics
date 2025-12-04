package aula.java.generic.ex02;

public class ResponseUsage {
	public static void main(String[] args) {
		Response<String> r1 = new Response<>("OK", "Operação feita");
		System.out.println(r1.getData());
	}
}
