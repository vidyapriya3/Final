package Factory;

import Iterator.GrassMenuIterator;
import Iterator.*;

public class FlowerMenu {

	int numberOfItems = 0;
	Flower[] flowerMenu;

	public FlowerMenu() {

		flowerMenu = new Flower[6];

		flowerMenu[0] = new Daylily();
		flowerMenu[1] = new Dianthus();
		flowerMenu[2] = new Lavender();
		flowerMenu[3] = new Marigold();
		flowerMenu[4] = new Sunflower();

	}

	public Iterator createIterator() {
		return new FlowerMenuIterator(flowerMenu);
	}
}
