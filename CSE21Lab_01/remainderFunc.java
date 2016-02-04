import java.util.Scanner;
public class remainderFunc {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Please enter the max number:");
		int max = input.nextInt();
		System.out.print("Please enter the divisor:");
		int div = input.nextInt();
		
			
		for (int i = 1; i <= max; i++) {
			System.out.println("Num:" + i + " % " + div + " = " + i%div);
			
		}
	
}
}
