package aula.java.generic.ex11;

public class CrudUsage {
	public static void main(String[] args) {
		GenericRepository<UserEntity, Integer> repo = new GenericRepositoryImpl<>();
		repo.save(1, new UserEntity(1, "Alex"));
		System.out.println(repo.findById(1).getNome());
	}
}
