package lektion;

public class methodLibrary {

	public static void main(String[] args) {
		System.out.println(fahrenheitToKelvin(40));
		System.out.println(kelvinToCelsius(0));
		System.out.println(velocityConversion(90));
		System.out.println(kineticEnergy(2,2));
		System.out.println(potentialEnergy(2,5));
		System.out.println(delta(1,5,10));
		System.out.println(smallLetters("PaParaZZi"));
		System.out.println(pr0grammering("Jag vill bli godkänd i programmering! <3"));
		System.out.println(svtTime(10,2));
		System.out.println(work(50,10));
		
	}
	/**
	 * Converts Fahrenheit to Kelvin
	 * @param fahrenheit
	 * @return
	 */
	public static double fahrenheitToKelvin (double fahrenheit) {
		double Kelvin = ((fahrenheit + 459.67)*5/9);
		return Kelvin;
	}
	
	public static double kelvinToCelsius(double kelvin) {
		double Celsius = (kelvin - 273.15);
		return Celsius;
	}
	public static double velocityConversion(double velocityKmH) {
		double velocityMs = (velocityKmH/3.6);
		return velocityMs;
	}
	public static double kineticEnergy(double mass, double velocity) {
		double kinEnergy = (((mass) * (velocity * velocity)) / 2);
		return kinEnergy;
	}
	public static double potentialEnergy(double mass, double height) {
		double potEnergy = (mass * 9.82 * height);
		return potEnergy;
	}
	public static double delta(double first, double second, double last) {
		double Medel = ((first + second + last) /3);
		return Medel;
	}
	public static String smallLetters(String word) {
		String pap = word.toLowerCase();
		return pap;
	}
	public static String pr0grammering(String word) {
		String mening = word.replace('o', '0').toUpperCase();
		return mening;
	}
	public static double svtTime(double distance, double velocity) {
		double time = (distance / velocity);
		return time;
	}
	public static double work(double force, double distance) {
		double Nm = (force * distance);
		return Nm;
	}
	public static double velocityToHeight(double velocity) {
		double height = (-16 * Math.pow(height, 2) + (velocity * height) + height);
	}
}
