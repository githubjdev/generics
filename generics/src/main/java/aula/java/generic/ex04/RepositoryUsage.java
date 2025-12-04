package aula.java.generic.ex04;

public class RepositoryUsage {
	public static void main(String[] args) {
		InMemoryRepository<String, Integer> repo = new InMemoryRepository<>();
		repo.save(1, "Alex");
		System.out.println(repo.findById(1));
	}
}
