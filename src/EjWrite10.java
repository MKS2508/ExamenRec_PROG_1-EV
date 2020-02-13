
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class EjWrite10 {
	public static void main(String[] args) {
		int[] nums1 = { 1, 11, 3, 8, 1 };
		EjWrite10 e10 = new EjWrite10();
		e10.ContarxArray(nums1);
	}

	public void ContarxArray(int[] nums1) {
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(11);
		list.add(3);
		list.add(3);
		list.add(3);
		list.add(11);

		System.out.println("Lista de elementos: " + list);
		Set<Integer> uniqueSet = new HashSet<Integer>(list);
		for (Integer i : uniqueSet) {
			System.out.println(i + ": " + Collections.frequency(list, i));
		}
	}
}
