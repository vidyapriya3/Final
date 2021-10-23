package Factory;

public class PrintAllPlants {
	public void PrintFlowerMenu() {
		FlowerMenu flowerMenu = new FlowerMenu();
		PrintFlowerMenu printFlowerMenu = new PrintFlowerMenu(flowerMenu);
		printFlowerMenu.PrintMenu();
	}

	public void printTreeMenu() {
		TreeMenu treeMenu= new TreeMenu();
		PrintTreeMenu printTreeMenu= new PrintTreeMenu(treeMenu);
		printTreeMenu.PrintMenu();
	}
	public void printGrassMenu() {
		GrassMenu grassMenu = new GrassMenu();
		PrintGrassMenu printGrassMenu = new PrintGrassMenu(grassMenu);
		printGrassMenu.PrintMenu();
	}
}
