package com.aurionpro.model;

import java.util.Scanner;

public class TreasureIsland {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Welcome to Treasure Island.\nYour misssion is to find the treasure.");
		System.out.println("Left or Right? ");
		if(sc.next().equalsIgnoreCase("Left"))
		{
			System.out.println("Swim or Wait? ");
			if(sc.next().equalsIgnoreCase("Wait"))
			{
				System.out.println("Which door? Red(R)/Blue(B)/Yellow(Y)");
			char ch = sc.next().charAt(0);
			switch(Character.toUpperCase(ch)) {
			case 'R':
				System.out.println("Burned by fire.\nGame Over.");
				break;
			case 'B':
				System.out.println("Eaten by Beasts.\nGame Over.");
				break;
			case 'Y':
				System.out.println("You Win!");
				break;
			default:
				System.out.println("Game Over.");
			}
			
			}
			else
				System.out.println("Attacked by trout.\nGame Over");	
			
		}
		else
			System.out.println("You have fallen into a hole.\nGame Over.");
	}

}
