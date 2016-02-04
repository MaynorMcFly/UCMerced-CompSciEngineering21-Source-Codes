import java.util.Scanner;
public class Shop {

	static double discount1 = 0;
	static double discount2 = 0; //This is needed to be global to be accessible to the other methods
	
	//Setup Shop (I)
	public static int Setup(Scanner input, String[] names, double[]prices) {
		System.out.print("Please enter the number of items:"); //1. Ask for the number of items to sell
		int items = input.nextInt();
		
		
		//for loop needed because when you enter items after that it has to keep looping
		for (int i = 0; i < items; i++){ 
			
			System.out.print("Enter name of product " + i + ":"); //2. For each item
			names[i] = input.next(); // Ask for number of the item
			
			System.out.print("Enter price of product " + i + ":");
			prices[i] = input.nextDouble();	//Ask for number of the item
		}
		//3. Discount
		System.out.print("Please enter the amount to qualify for discount:");
		discount1 = input.nextDouble(); //Ask for threshold (over which amount to give discount)
		
		System.out.print("Please enter the discount rate (0.1 for 10%):");
		discount2 = input.nextDouble();	 //Ask for the rate
		
		return items;
		
	} //Buy Items (II)
	public static void Buy(Scanner input, String[] names, double[] prices, int[] amounts, int items) {
	
		for (int i = 0; i < items; i++){
			System.out.print("Enter the amount of " + names[i] + ":");
			amounts[i] = input.nextInt(); //2. Amount they wish to purchase
			
		}
		
	}// List of Items (III)
	public static void List(String [] names, double[] prices, int[] amounts, int items) {
		
		for(int i = 0; i < items; i++) {
			if (amounts[i] > 0) {
		
			System.out.println(amounts[i] + " count of " + names[i] + " @  $" + prices[i] + " = $" + (amounts[i]*prices[i]));
			/* 3. For each item purchased (non-zero amount)
			a. Display amount purchase and price per item */
	}
		
			}
	
	}//Check Out (IV)
	public static void Checkout(double[] prices, int[] amounts) {
		
		double total = 0;
		
		for(int i = 0; i < amounts.length; i++) {
		total = prices[i]*amounts[i] + total;
		}
		
		double disc = 0;
		disc = (total*(discount2));
		
		if (total >= discount1){
			System.out.println();
			System.out.println("Thanks for coming!");
			System.out.println("Sub Total:" + total);
			System.out.println("-Discount:" + (disc));
			System.out.println("Total    :" + (total - (disc)));
		}
		else if (total < discount1){
			System.out.println();
			System.out.println("Thanks for coming!");
			System.out.println("Sub Total:" + total);
			System.out.println("-Discount:" + "$0.0");
			System.out.println("Total    :" + total);
			
			/* 3. Display the summary
				a. Sub Total 
				b. Discount 
				c. Total */
				
		}

	}
	
	public static void main(String[] args) {
		final int MAX = 100;
		int set = 0;
		int buy = 0;
		int items = 0;
		
		String[] names = new String[MAX];
		double[] prices = new double[MAX];
		int[] amounts = new int[MAX];
		
		do{
			Scanner input = new Scanner(System.in);
			System.out.println("This program supports 4 functions:");
			System.out.println("1. Setup Shop");
			System.out.println("2. Buy");
			System.out.println("3. List Items");
			System.out.println("4. Checkout");
			System.out.print("Please choose the function you want:");
			int func = input.nextInt();
			
		if ( 1 <= func || func >= 4){
		
		// 4. User can run setup multiple times so keep the latest version		
		if (func == 1){
			if (set == 0){
				items = Setup (input, names, prices);
				
				//System.out.println("Please enter the number of items:");	
			}
			
			set = 1;
			
		}
		
		if (func == 2){
			if (set == 1){
				System.out.println();
				Buy(input, names, prices, amounts, items);
				System.out.println();
				
				
			}
			else{ 
				System.out.println();
				System.out.print("Shop is not setup yet!"); 
				System.out.println();
				System.out.println();// 1. If setup is not done yet, telling customer to setup shop first
				
		}
			buy = 1;
			
		}
			
		if (func == 3){
		
			if (buy == 1){
			System.out.println();
			List(names, prices, amounts, items);
			System.out.println();
		}		
		
			if (set == 1 && buy == 0){
			System.out.println();
			System.out.println("Try again: You have not bought anything");
			System.out.println(); //2. If setup is done but the customer hasnÕt bought anything then ask to buy first
			
			
		}	
			if (set == 0){
			System.out.println();
			System.out.println("Shop is not setup yet!");
			System.out.println();//1. If setup is not done yet then tell customer to setup shop first
		}
				
		}
		
		
		if (func == 4){
			if (set == 0){
				System.out.println();
				System.out.println("Shop is not setup yet!");
				System.out.println(); // If setup is not done yet then tell customer to setup shop first
				continue;
		}
			if (buy == 0){
				System.out.println();
				System.out.println("Try again: You have not bought anything");
				System.out.println(); //If setup is done but the customer hasnÕt bought anything then ask to buy first
				continue;
		}
			if (buy == 1){
				Checkout(prices, amounts);
				break;
				
				//4. End the program
		} 	
				
			}
	
		
		else if (func > 4){
			System.out.println();
			System.out.println("Error: Do not know " + func);	
			System.out.println();
		}	
		
			}

		
		}
		while(true);
			}
}


// Project by: Annaliza Torres CSE 21



		


		
	
		
	

	
	

			
		
		







