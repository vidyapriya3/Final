package test;
import Factory.*;
import Iterator.*;
public class IteratorUnitTest {

	public static void main(String[] args) {
		TreeMenu treeMenu = new TreeMenu();
		Iterator iterator = treeMenu.createIterator();
		if(iterator.hasNext()) {
			System.out.println("Valid Test has next Item");
		}
		else {
			System.err.println("Invalid Call to iterator hasNext");
		}
	}

}
