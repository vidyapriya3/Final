package State;

import java.util.Scanner;

public class MainMenuStatus implements State {

	@Override
	public void printAllPlants(Context context) {
		Scanner input = new Scanner(System.in);
		System.out.println( "\n\n *********Welcome to YardCare system********\n\n"+
		"Enter number for Menu Selection\n"+
		"1.View All plants\n"+
		"2.View All Categories\n"+
		"3.Quit\n");

		int choice = input.nextInt();

		switch(choice) {
		case 1:
			ViewAllPlantsState allPlants = new ViewAllPlantsState();
			allPlants.printAllPlants(context);
			break;
		case 2:
			ViewCategoriesState categoriesState = new ViewCategoriesState();
			categoriesState.printAllPlants(context);
			break;
		case 3:
			System.out.println("Shutdown");
			System.exit(0);
		}

	}

}
