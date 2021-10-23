package Iterator;

import Factory.Grass;

public class GrassMenuIterator implements Iterator {


	Grass[] grassMenu;
	int position;
	
	public GrassMenuIterator(Grass[] grassMenu) {
		this.grassMenu = grassMenu;
	}
	
	@Override
	public boolean hasNext() {
		if(position > grassMenu.length || grassMenu[position] == null) {
			return false;
		}
		else return true;
	}

	@Override
	public Grass next() {
		
		Grass grassMenupos = (Grass) grassMenu[position];
		position = position +1;
		
		return grassMenupos;
	}
	
}
