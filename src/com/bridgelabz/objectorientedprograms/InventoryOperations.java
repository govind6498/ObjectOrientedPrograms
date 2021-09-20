package com.bridgelabz.objectorientedprograms;
import java.util.*;
public class InventoryOperations implements InventoryOperationIF {

	public static Scanner scannerObject = new Scanner(System.in);
	@Override
	public Inventory addInventory() {
		Inventory inventoryObject = new Inventory();
		System.out.println("Enter the Inventory Name:");
		inventoryObject.setName(scannerObject.next());
		
		System.out.println("Enter the price of Inventory:");
		inventoryObject.setPrice(scannerObject.nextInt());
		
		System.out.println("Enter the weight of Inventory:");
		inventoryObject.setWeight(scannerObject.nextInt());
		System.out.println(inventoryObject);
		return inventoryObject;
	}

	@Override
	public void calculateValue(Inventory[] inventoryArray) {
		for(int eachInventory = 0;eachInventory<inventoryArray.length;eachInventory++) {
			if(inventoryArray[eachInventory]!=null) {
				Inventory inventory = inventoryArray[eachInventory];
				int value = inventory.getPrice()*inventory.getWeight();
				System.out.println("The value of "+inventory.getName()+" is: "+value);
			}
		}
	}

}
