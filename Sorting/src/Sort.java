import java.util.ArrayList;

public class Sort<T extends Comparable<T>> {
	private ArrayList<T> list = new ArrayList<>();

	public Sort(ArrayList<T> a) {
		list = a;
	}

	public ArrayList<T> insertionSort() {
		for(int i = 1; i < list.size(); i++) {
			T t = list.get(i);
			int pos = i;
			
		}
	}
}
