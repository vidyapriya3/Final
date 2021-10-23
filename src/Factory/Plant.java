package Factory;

public class Plant {
	String plantName;
	String description;
	String humidity;
	String sunlight;
	String soilPH;
	String fertilizer;
	String water;
	String Soil;

    public String getName() {
	return plantName;
}
    public void setName(String name) {
    	this.plantName = name;
    }
    
    public String getDescription() {
    	return description;
    }
    
    public void setDescription(String description) {
    	this.description = description;
    }
    
    
    public String getHumidity() {
    	return humidity;
    }
    public void setHumidity(String humidity) {
    	this.humidity = humidity;
    }
    public String getSunlight() {
    	return  sunlight;
    	
    }
    public void setSunlight(String sunlight) {
    	this.sunlight = sunlight;
    }
    public String getSoilPh() {
    	 return soilPH;
    	
    }
    public void setSoilPH(String soilPH) {
    	this.soilPH = soilPH;
    	
    }
    public String getFertilizer() {
   	 return fertilizer;
   	
   }
   public void setFertilizer(String fertilizer) {
   	this.fertilizer = fertilizer;
   	
   }
   public String getWater() {
  	 return water;
  	
  }
  public void setWater(String water) {
  	this.water = water;
  	
  }
  public String getSoil() {
 	 return Soil;
 	
 }
 public void setSoil(String soil) {
 	this.Soil = soil;
 	
 }
}
