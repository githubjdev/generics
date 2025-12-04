package aula.java.generic.ex03;

public class StartsWithFilter implements Filter<String> {
	private String prefix;

	public StartsWithFilter(String p) {
		prefix = p;
	}

	public boolean apply(String item) {
		return item != null && item.startsWith(prefix);
	}
}