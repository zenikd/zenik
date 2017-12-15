package iterators;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Test {
	public static void main(String[] args) {
		Set<String> words = new HashSet<String>();
		words.add("one");
		words.add("two");
		words.add("three");
		Iterator<String> iterator = words.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}

}
