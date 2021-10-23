package Factory;

import Facade.*;
import Iterator.Iterator;

public class PrintGrassMenu implements PrintMenus {

	GrassMenu grassMenu;


	public PrintGrassMenu(GrassMenu grassMenu) {
		this.grassMenu = grassMenu;

	}

	public void PrintMenu() {

		Iterator iterateGrassMenu = grassMenu.createIterator();
		printMenu(iterateGrassMenu);
	}

	private void printMenu(Iterator iterator) {

		System.out.println( "\n\n\n\n*************Grass Menu*************\n\n");

		while(iterator.hasNext()) {
			Grass grass = (Grass) iterator.next();


			System.out.println("\n============"+grass.getName()+ "============"+ "\t");
			System.out.println(grass.getBotany()  + "\t");
			System.out.println(grass.getDescription()  + "\t");
			System.out.println(grass.getHumidity()  + "\t");
			System.out.println(grass.getSunlight()  + "\t");
			System.out.println(grass.getSoilPh()  + "\t");
			System.out.println(grass.getFertilizer()  + "\t");
			System.out.println(grass.getWater()  + "\t");
			System.out.println(grass.getSoil()  + "\t");
		}


	}


}
