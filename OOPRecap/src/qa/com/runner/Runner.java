package qa.com.runner;

import qa.com.model.Sim;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Creating a new variable of type sim
		
		Sim polly = new Sim("Polly", "Professional Thief", 30567.75f, true, 7);
		Sim notVampireSteve = new Sim("Steve", "Vampire Hunter", 10, 6);
		
		//These methods can no longer be used as the variables are private
//		System.out.println(polly.aspiration);
//		System.out.println(polly.drinksBlood);
//		System.out.println(notVampireSteve.drinksBlood);

		System.out.println(polly.isDrinksBlood());
		System.out.println(notVampireSteve.isDrinksBlood());
		polly.setAspiration("Nasa Astronaut");
		System.out.println(polly.getAspiration());
		System.out.println(notVampireSteve.getAspiration());
		
		
		
	}

}
