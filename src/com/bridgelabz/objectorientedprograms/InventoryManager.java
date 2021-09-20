package com.bridgelabz.objectorientedprograms;
import java.util.*;
import com.bridgelabz.objectorientedprograms.Inventory;
public class InventoryManager {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Inventory[] inventoryArray = new Inventory[3]; 
		int arrayIndex = 0;
		Inventory inventoryObject = new Inventory();
		InventoryOperations operationObject = new InventoryOperations();

				do {
					System.out.println("1 :Add Inventory : value of each inventory:");
					int userChoice = sc.nextInt();
					switch(userChoice) {
					case 1:
						inventoryObject = operationObject.addInventory();
						inventoryArray[arrayIndex] = inventoryObject;
						arrayIndex++;
						break;
					case 2:
						operationObject.calculateValue(inventoryArray);
						break;
					}
					System.out.println("If you want to perform Operations Enter true:");

				}
				while(sc.nextBoolean());
		sc.close();
	}
}
