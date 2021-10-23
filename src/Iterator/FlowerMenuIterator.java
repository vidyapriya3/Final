package Iterator;

import Factory.Flower;

public class FlowerMenuIterator implements Iterator {
    
	Flower[] flowerMenu;
	int position;
	
	public FlowerMenuIterator(Flower[] flowerMenu) {
		this.flowerMenu = flowerMenu;
	}
	
	@Override
	public boolean hasNext() {
		if(position > flowerMenu.length || flowerMenu[position] == null) {
			return false;
		}
		else return true;
	}

	@Override
	public Flower next() {
		
		Flower flowerMenupos = (Flower)flowerMenu[position];
		position = position +1;
		
		return flowerMenupos;
	}
	
}
