package com.bridgelabz.objectorientedprograms;
import java.util.*;
public class InventoryMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Inventory riceObject = new Inventory();
		Inventory pulseObject = new Inventory();
		Inventory wheatObject = new Inventory();

		System.out.println("-----------Welcome To Inventory Management----------");
		System.out.println("Enter the rice brand name: ");
		riceObject.setName(sc.next());
		System.out.println("Enter the rice Wieght: ");
		riceObject.setWeight(sc.nextInt());
		System.out.println("Enter the rice per Kg: ");
		riceObject.setPrice(sc.nextInt());
		System.out.println(riceObject);

		System.out.println("Enter the pulse brand Name: ");
		pulseObject.setName(sc.next());
		System.out.println("Enter the pulse weight: ");
		pulseObject.setWeight(sc.nextInt());
		System.out.println("Enter the pulse per Kg:");
		pulseObject.setPrice(sc.nextInt());
		System.out.println(pulseObject);

		System.out.println("Enter the wheat brand Name: ");
		wheatObject.setName(sc.next());
		System.out.println("Enter the wheat weight: ");
		wheatObject.setWeight(sc.nextInt());
		System.out.println("Enter the wheat per Kg:");
		wheatObject.setPrice(sc.nextInt());
		System.out.println(wheatObject);

		System.out.println("------------Inventory Values-----------");

		int riceCost  = riceObject.getWeight()*riceObject.getPrice();
		System.out.println("Inventory Value of Rice: "+riceObject.getName()+":"+riceCost);
	int pulseCost = pulseObject.getWeight()*pulseObject.getPrice();
	System.out.println("Inventory Value of Pulse:"+pulseObject.getName()+":"+pulseCost);
	
	int wheatCost = wheatObject.getWeight()*wheatObject.getPrice();
	System.out.println("Inventory value of wheat: "+wheatObject.getName()+":"+wheatCost);
	sc.close();
	}
}
