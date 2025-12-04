package aula.java.generic.ex04;
import java.util.*;

public class InMemoryRepository<T, ID> {

    private Map<ID, T> storage = new HashMap<>();

    public void save(ID id, T entity) {
        storage.put(id, entity);
    }

    public T findById(ID id) {
        return storage.get(id);
    }

    public List<T> findAll() {
        return new ArrayList<>(storage.values());
    }

    public void delete(ID id) {
        storage.remove(id);
    }
}
