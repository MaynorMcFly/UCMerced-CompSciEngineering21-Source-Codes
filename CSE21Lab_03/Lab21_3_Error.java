import java.util.Random;

public class Lab21_3_Error {

	public static void main(String[] args) {

		final int MAXCHEESE = 15; //Amount of value can hold
	
		String[] names = new String[MAXCHEESE];
		double[] prices = new double[MAXCHEESE];
		int[] amounts = new int[MAXCHEESE]; //Array sizes

		// Special 3 Cheeses
		
		if (0 < MAXCHEESE & MAXCHEESE<21){	
		names[0] = "Dalaran Sharp";
		prices[0] = 1.25;
		
		if (1 < MAXCHEESE){
		names[1] = "Stormwind Brie";
		prices[1] = 10.00;
		}
		
		if (2 < MAXCHEESE){
		names[2] = "Alterac Swiss";
		prices[2] = 40.00;
		}
		
 		System.out.println("We sell " + MAXCHEESE + " kinds of Cheese");
 		
		System.out.println(names[0] + ": $" + prices[0] + " per pound");
		
		if (1 < MAXCHEESE)
		System.out.println(names[1] + ": $" + prices[1] + " per pound");
		
		if (2 < MAXCHEESE)
		System.out.println(names[2] + ": $" + prices[2] + " per pound");

	Random ranGen = new Random(100);

	
		for (int i = 3; i < MAXCHEESE; i++) {
			names[i] = "Cheese Type " + (char)('A'+i);
			prices[i] = ranGen.nextInt(1000)/100.0;
			amounts[i] = 0;
		
			System.out.println(names[i] + ": $" + prices[i] + " per pound");
		}
		
		}
		
		if (MAXCHEESE == 0)
 		System.out.println("We sell 0 kinds of Cheese");
	}
	
		
}



