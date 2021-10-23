package Factory;

import Facade.PrintMenus;
import Iterator.Iterator;

public class PrintTreeMenu implements PrintMenus {

	TreeMenu treeMenu;


	public PrintTreeMenu(TreeMenu treeMenu) {
		this.treeMenu = treeMenu;

	}

	public void PrintMenu() {

		Iterator iterateTreeMenu = treeMenu.createIterator();
		printMenu(iterateTreeMenu);
	}

	private void printMenu(Iterator iterator) {

		System.out.println( "\n\n\n\n*************Tree Menu*************\n\n");

		while(iterator.hasNext()) {
			Tree tree = (Tree) iterator.next();


			System.out.println("\n============"+tree.getName()+ "============"+ "\t");
			System.out.println(tree.getDescription()  + "\t");
			System.out.println(tree.getHumidity()  + "\t");
			System.out.println(tree.getSunlight()  + "\t");
			System.out.println(tree.getSoilPh()  + "\t");
			System.out.println(tree.getFertilizer()  + "\t");
			System.out.println(tree.getWater()  + "\t");
			System.out.println(tree.getSoil()  + "\t");
		}


	}
}
