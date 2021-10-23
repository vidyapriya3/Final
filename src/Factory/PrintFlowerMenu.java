package Factory;
import Facade.*;
import Iterator.Iterator;

public class PrintFlowerMenu implements PrintMenus{
	FlowerMenu flowerMenu;


	public PrintFlowerMenu(FlowerMenu flowerMenu) {
		this.flowerMenu = flowerMenu;

	}

	public void PrintMenu() {

		Iterator flowerIterator = flowerMenu.createIterator();
		printMenu(flowerIterator);
	}

	private void printMenu(Iterator iterator) {

		System.out.println( "\n\n\n\n*************Flower Menu*************\n\n");

		while(iterator.hasNext()) {
			Flower flower = (Flower) iterator.next();


			System.out.println("\n============"+flower.getName()+ "============"+ "\t");
			System.out.println(flower.getDescription()  + "\t");
			System.out.println(flower.getHumidity()  + "\t");
			System.out.println(flower.getSunlight()  + "\t");
			System.out.println(flower.getSoilPh()  + "\t");
			System.out.println(flower.getFertilizer()  + "\t");
			System.out.println(flower.getWater()  + "\t");
			System.out.println(flower.getSoil()  + "\t");
		}


	}
}
