package aula.java.generic.ex09;

import java.util.Arrays;
import java.util.List;

public class SorterUsage {
	public static void main(String[] args) {
		Sorter<Integer> sorter = new Sorter<>();
		List<Integer> list = Arrays.asList(3, 1, 2);
		System.out.println(sorter.sort(list));
	}
}
