package qa.com.model;

public class Sim {
	
	public String name;
	public String aspiration;
	public float simoleons;
	public boolean isVampire;
	public int hunger;
	
	//Make a constructor with shift + alt + s / right click -> source -> generate constructore using fields
	public Sim(String name, String aspiration, float simoleons, boolean isVampire, int hunger) {
		super();
		this.name = name;
		this.aspiration = aspiration;
		this.simoleons = simoleons;
		this.isVampire = isVampire;
		this.hunger = hunger;
	}

	//creates a method we can use to print out all aspects of our object
	
	//@something - an annotation, tells java what the purpose of this method is
	@Override
	public String toString() {
		return "Sim [name=" + name + ", aspiration=" + aspiration + ", simoleons=" + simoleons + ", isVampire="
				+ isVampire + ", hunger=" + hunger + "]";
	}
	
	
	
	
	

}
