package Basic;

import java.util.Scanner;

public class ProfitLoss {
	public static void main(String[] args) {
		// WWrite a JAVA Program to take the Cost Price and Selling Price from the user
		// and then calculate
		// the Profit and Lose also the Profit % and Loss %
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the Cost Price ");
		double costPrice = input.nextDouble();
		System.out.print("Enter the Selling Price  ");
		double sellingprice = input.nextDouble();

		//Math.abs()  => abs() method is the absolute() of the Math class which convert -ve number to +ve number.
		
		
		if (costPrice < sellingprice) {
			double profit = sellingprice - costPrice;
			double profitPrecent = (profit / costPrice) * 100;
			System.out.println("The Profit is " + profit + " and the profit % is " + profitPrecent);
		} else if (costPrice > sellingprice) {
			double loss = costPrice - sellingprice;
			double lossPrecent = (loss / costPrice) * 100;
			System.out.println("The Loss is " + loss + " and the loss % is " + lossPrecent);
		} else {
			System.out.println("Nither Profit nor Loss ");
		}

		input.close();
	}
}
