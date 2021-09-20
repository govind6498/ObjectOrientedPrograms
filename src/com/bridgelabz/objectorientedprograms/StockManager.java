package com.bridgelabz.objectorientedprograms;
import java.util.*;
public class StockManager {
	public static void main(String[] args) {
		Scanner scannerObject = new Scanner(System.in);
		Stock[] stockArray = new Stock[3];
		int arrayIndex = 0;
		Stock stockObject = new Stock();

		StockOperations operationObject = new StockOperations();

		do {
			System.out.println("1:Add Stock :value of each Inventory : Total Value of Stock:");
			int userChoice = scannerObject.nextInt();
			switch(userChoice) {
			case 1:
				stockObject = operationObject.addStock();
				stockArray[arrayIndex] = stockObject;
				arrayIndex++;
				break;
			case 2:
				operationObject.calcuateEachStockValue(stockArray);
				break;
			case 3:
				operationObject.calculateTotalValue(stockArray);
				break;
			}
			System.out.println("If You want to perform more opeartion");
		}
		while(scannerObject.nextBoolean());
		scannerObject.close();

	}
}
