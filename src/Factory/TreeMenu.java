package Factory;
import Iterator.*;
public class TreeMenu {
	int numberOfItems = 0;
	Tree[] treeMenu;
	public TreeMenu() {
		treeMenu = new Tree[6];
		treeMenu[0] = new SunValleyMaple();
		treeMenu[1] = new Citrus();
	}

	public Iterator createIterator() {
		return new TreeMenuIterator(treeMenu);
	}
}
