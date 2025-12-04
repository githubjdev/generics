package aula.java.generic.ex09;
import java.util.*;

public class Sorter<T extends Comparable<T>> {
    public List<T> sort(List<T> list) {
        Collections.sort(list);
        return list;
    }
}
