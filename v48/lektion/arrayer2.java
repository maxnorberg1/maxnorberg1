package lektion;

public class arrayer2 {

	public static void main(String[] args) {

		double[] numbers = new double[20];
		double[] numbers2 = { 12.2, 34, -45.1121234 };
		int antalA = 0; 

		String[] namn = {"Billskog Gabriel", "Khanzaden Pedram", "Norberg Max", "Bratland Petter",  "Dahlqvist Ida", "Erlandsson Malte"};
		
		for (int i = 0; i < namn.length; i++) {
			
			
			for (int j = 0; j < namn[i].length(); j++) {
				if (namn[i].contains("a")) {
					antalA++;
				}
			}
		}
		System.out.println("Antal a är: " + antalA);
	}
	
		
}


