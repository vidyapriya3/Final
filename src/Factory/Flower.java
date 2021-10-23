package Factory;

public abstract class Flower extends Plant{

	String angiosperms;
	
	public void setplantName() {
		this.plantName = "Flower";
	}
	public String getAngiosperms() {
		return angiosperms;
	}
	public void setAngiosperms(String angiosperms) {
		this.angiosperms = angiosperms;
	}
}
