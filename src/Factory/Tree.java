package Factory;

public abstract class Tree extends Plant{

	  String yardTree;
	  
	  public void setName() {
		  
		  this.plantName = "Tree"; 
	  }
	  public String getYardTree() {
		  return yardTree;
		  
	  }
	  public void setYardTree(String yardTree) {
		  
		  this.yardTree = yardTree;
	  }
}
