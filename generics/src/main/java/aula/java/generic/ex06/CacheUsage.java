package aula.java.generic.ex06;

public class CacheUsage {
	public static void main(String[] args) {
		Cache<String, String> cache = new Cache<>();
		cache.put("token", "ABC");
		System.out.println(cache.get("token"));
	}
}
