package Factory;

import Iterator.GrassMenuIterator;
import Iterator.Iterator;

public class GrassMenu {

	int numberOfItems = 0;
	Grass[] grassMenu;
	
	public GrassMenu() {
		
		grassMenu = new Grass[6];
		
		grassMenu[0] = new LawnGrass();
		grassMenu[1] = new BlueGrass();
		grassMenu[2] = new FountainGrass();
		
	}
	
	public Iterator createIterator() {
		return new GrassMenuIterator(grassMenu);
	}
}