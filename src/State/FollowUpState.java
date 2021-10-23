package State;

import java.util.Scanner;

public class FollowUpState implements State {

	@Override
	public void printAllPlants(Context context) {
		Scanner input = new Scanner(System.in);
		System.out.println( "\n\nWhat do you want to do next\n"+
		"1.Main menu\n"+
		"2.View Categories\n"+
		"3.View All Plants\n"+
		"4.Log out");

		int choice = input.nextInt();

		switch(choice) {
		case 1:
			MainMenuStatus mainMenuState = new MainMenuStatus();
			mainMenuState.printAllPlants(context);
			break;
		case 2:
			ViewCategoriesState categoriesState = new ViewCategoriesState();
			categoriesState.printAllPlants(context);
			break;
		case 3:
			ViewAllPlantsState allPlants = new ViewAllPlantsState();
			allPlants.printAllPlants(context);
			break;
		case 4:
			System.out.println("Shutdown");
			System.exit(0);
			break;
		}

	}

}
