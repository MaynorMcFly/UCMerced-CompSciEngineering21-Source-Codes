import java.util.Scanner;
public class CheeseShop {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("We sell 3 kinds of Cheese");
		System.out.println("Dalaran Sharp: $1.25 per pound");
		System.out.println("Stormwind Brie: $10.00 per pound");
		System.out.println("Alterac Swiss: $40.00 per pound");
		
		System.out.print("Enter the amount of Sharp: ");
		int sharp = input.nextInt();
		System.out.print("Enter the amount of Brie: ");
		int brie = input.nextInt();
		System.out.print("Enter the amount of Swiss: ");
		int swiss = input.nextInt();
		
		System.out.print("Display the itemized list? (1 for yes) ");
		int itemizedlist = input.nextInt();
		
		double total = sharp*1.25 + brie*10.00 + swiss*40.00;
		double discount = 0;
		if (total >= 100)
			discount = 25;
		else if (total >=50)
			discount = 10;
		
		if (itemizedlist ==1) {
			if (sharp > 0)
				System.out.println(sharp + "lbs of Sharp @ $1.25 = $" + sharp*1.25);
			if (brie > 0)
				System.out.println(brie + "lbs of Brie @ $10.00 = $" + brie*10.00);
			if (swiss > 0)
				System.out.println(swiss + "lbs of Swiss @ $40.00 = $" + swiss*40.00);
		}
		
		System.out.println("Sub Total: $" + total);
		System.out.println("-Discount: $" + discount);
		System.out.println("Total" + ":" + (total-discount));
	}

}
