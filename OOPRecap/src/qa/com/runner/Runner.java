package qa.com.runner;

import qa.com.model.Sim;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Creating a new variable of type sim
		
		Sim polly = new Sim("Polly", "Professional Thief", 30567.75f, true, 7);
		
		System.out.println(polly.aspiration);
		
		System.out.println(polly.getClass().getTypeName());
		
	}

}
