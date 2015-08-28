import java.util.Scanner;

public class SalesTax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String customerNo, customerName, taxCode;
		double salesAmount, total;
		
		Scanner keyboard = new Scanner(System.in);

		System.out.print("Please enter the customer number.");
		customerNo = keyboard.next();
		System.out.print("Please enter the customer name.");
		customerName = keyboard.next();
		System.out.print("Please enter the sales amount.");
		salesAmount = keyboard.nextDouble();
		System.out.print("Please enter the tax code.");
		taxCode = keyboard.next();
		
		if (taxCode.equals("NRM") || taxCode.equals("NPF") || taxCode.equals("BIZ")) {
			if (taxCode.equals("NRM")) {
				total = salesAmount * 1.06;
			} else if (taxCode.equals("NPF")) {
				total = salesAmount;
			} else {
				total = salesAmount * 1.045;
			}
			System.out.println("The total amount is " + total);
		} else {
			System.out.println("The tax code is invalid.");
		}
		
	}

}
