package State;

import java.util.Scanner;

import Factory.FlowerMenu;
import Factory.GrassMenu;
import Factory.PrintFlowerMenu;
import Factory.PrintGrassMenu;
import Factory.PrintTreeMenu;
import Factory.TreeMenu;


public class ViewCategoriesState implements State{
	@Override
	public void printAllPlants(Context context) {
		Scanner input = new Scanner(System.in);
		System.out.println( "\n\n *********Welcome to YardCare system********\n\n"+
		"Enter number for Selection\n"+
		"1.Flower Menu\n"+
		"2.Tree Menu\n"+
		"3.Grass Menu\n");

		int choice = input.nextInt();

			if(choice == 1) {
				FlowerMenu flowermenu = new FlowerMenu();
				PrintFlowerMenu printFlowerMenu = new PrintFlowerMenu(flowermenu);
			    printFlowerMenu.PrintMenu();
			}
			else if(choice == 2) {
				TreeMenu treemenu = new TreeMenu();
				PrintTreeMenu printTreeMenu = new PrintTreeMenu(treemenu);
				printTreeMenu.PrintMenu();
			}

			else if(choice == 3) {
				GrassMenu grassmenu = new GrassMenu();
				PrintGrassMenu printGrassMenu = new PrintGrassMenu(grassmenu);
				printGrassMenu.PrintMenu();

			}


			FollowUpState followUpState = new FollowUpState();
			followUpState.printAllPlants(context);

	}
}
