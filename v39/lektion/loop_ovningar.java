package lektion;

public class loop_ovningar {

	public static void main(String[] args) {
		
		int sum = 0;
		
		for (int i = 0; i < 100; i++) {
			sum = sum + i;
		}
		System.out.println("Den totala summan av alla heltal under 100 är: " + sum);
		
		
		System.out.println("\n" + "Alla heltal under mellan 25 och 50: ");
		for (int i = 25; i <= 50; i++) {
			System.out.println(i);
		}
		System.out.println("\n" + "Alla positiva heltal under under 20 i omvänd ordning: ");
		for (int i = 20; i >= 0; i--) {
			System.out.println(i);
		}
	}

}
