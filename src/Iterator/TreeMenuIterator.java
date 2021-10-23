package Iterator;

import Factory.Tree;

public class TreeMenuIterator implements Iterator {

	
	Tree[] treeMenu;
	int position;
	
	public TreeMenuIterator(Tree[] treeMenu) {
		this.treeMenu = treeMenu;
	}
	
	@Override
	public boolean hasNext() {
		if(position > treeMenu.length || treeMenu[position] == null) {
			return false;
		}
		else return true;
	}

	@Override
	public Tree next() {
		
		Tree treeMenupos = (Tree) treeMenu[position];
		position = position +1;
		
		return treeMenupos;
	}
	
}
