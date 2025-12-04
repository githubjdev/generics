package aula.java.generic.ex11;

import java.util.*;

public interface GenericRepository<T, ID> {
	void save(ID id, T e);

	T findById(ID id);

	List<T> findAll();

	void update(ID id, T e);

	void delete(ID id);
}