package State;
import Factory.*;
import java.util.*;
public class ViewAllPlantsState implements State {

	@Override
	public void printAllPlants(Context context) {
		PrintAllPlants allPlants = new PrintAllPlants();
		allPlants.PrintFlowerMenu();
		System.out.print("\n\n\n");
		allPlants.printGrassMenu();
		System.out.print("\n\n\n");
		allPlants.printTreeMenu();

		Scanner input = new Scanner(System.in);

		System.out.println("\n\nWhat do you want to do next?\n\n"
				+ "1) Main menu\n"
				+ "2) View Categories\n"
				+ "3) Logout\n");

		int choice = input.nextInt();

		switch(choice) {
		case 1:
			MainMenuStatus mainMenuStatus = new MainMenuStatus();
			mainMenuStatus.printAllPlants(context);
			break;
		case 2:
			ViewCategoriesState categoriesState = new ViewCategoriesState();
			categoriesState.printAllPlants(context);
			break;
		}

		FollowUpState followUpState = new FollowUpState();
		followUpState.printAllPlants(context);
	}



}
