package _02_smurf;

public class SmurfRunner {
	public static void main(String[] args) {
		
		Smurf handySmurf = new Smurf("Handy");
		System.out.println(handySmurf.getName());
		handySmurf.eat();
		System.out.println();
		
		Smurf papaSmurf = new Smurf("Papa");
		System.out.println(papaSmurf.getName());
		System.out.println(papaSmurf.getHatColor());
		System.out.println();
		
		Smurf smurfette = new Smurf("Smurfette");
		System.out.println(smurfette.getName());
		System.out.println(smurfette.isGirlOrBoy());
		System.out.println();
	}
}
