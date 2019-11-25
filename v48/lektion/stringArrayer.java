package lektion;

public class stringArrayer {

	public static void main(String[] args) {

		String[] namn = {"Pedram", "Max"};
		
		for (int i = 0; i < 10; i++) {
			
			for (int j = 0; j < namn.length; j++) {
				i = i+1;
				System.out.println(4*i + ". " + namn[j]);
			}
		}
	}

}
