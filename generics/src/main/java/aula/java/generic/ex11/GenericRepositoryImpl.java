package aula.java.generic.ex11;

import java.util.*;

public class GenericRepositoryImpl<T, ID> implements GenericRepository<T, ID> {
	private Map<ID, T> data = new HashMap<>();

	public void save(ID id, T e) {
		data.put(id, e);
	}

	public T findById(ID id) {
		return data.get(id);
	}

	public List<T> findAll() {
		return new ArrayList<>(data.values());
	}

	public void update(ID id, T e) {
		data.put(id, e);
	}

	public void delete(ID id) {
		data.remove(id);
	}
}