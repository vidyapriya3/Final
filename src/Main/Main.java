package Main;

import State.ViewCategoriesState;
import State.*;
public class Main {

	public static void main(String[] args) {
		Context context = new Context();
		MainMenuStatus mainMenu = new MainMenuStatus();
		mainMenu.printAllPlants(context);
	}

}
