package Factory;

public abstract class Grass extends Plant{

	 String botany;
	 
	 public void setplantName() {
			this.plantName = "Grass";
		}
		public String getBotany() {
			return botany;
		}
		public void setBotany(String botany) {
			this.botany = botany;
		}
}
