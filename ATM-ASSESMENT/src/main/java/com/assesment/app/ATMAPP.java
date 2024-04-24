package com.assesment.app;

import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Map;
import java.util.Scanner;

import com.assesment.exception.ATMExceptions;
import com.assesment.impl.ATMOperationsImpl;

public class ATMAPP {

	    private static ATMOperationsImpl atm;

	    public static void main(String[] args) {
	        Map<Integer, Integer> denominations = new HashMap<>();
	        denominations.put(100, 10);
	        denominations.put(50, 20);
	        denominations.put(20, 30);
	        denominations.put(10, 50);

			atm = new ATMOperationsImpl(denominations);

			Scanner scanner = new Scanner(System.in);

			while (true) {
				System.out.println("Select an option:");
				System.out.println("1. Withdraw cash");
				System.out.println("2. Show remaining denominations");
				System.out.println("3. Exit");
				int choice = 0;
				try {
					
					choice = scanner.nextInt();

					scanner.nextLine();

					switch (choice) {
					case 1:
						withdrawCash(scanner);
						break;
					case 2:
						showRemainingDenominations();
						break;
					case 3:
						System.out.println("Exiting...");
						return;
					default:
						System.out.println("Invalid option");
					}
				} catch (InputMismatchException ex) {
					System.out.println("Invalid input...");
					 scanner = new Scanner(System.in);			
				}
			}
	    }
	    
	    
	    private static void withdrawCash(Scanner scanner) {
	        System.out.println("Enter amount to withdraw:");
	        int amount = scanner.nextInt();
	        scanner.nextLine(); 

	        try {
	            Map<Integer, Integer> withdrawal = atm.withdraw(amount);
	            System.out.println("Dispensed cash:");
	            withdrawal.forEach((denomination, count) ->
	                System.out.println(denomination + ": " + count)
	            );
	        } catch (ATMExceptions e) {
	            System.out.println(e.getMessage());
	        }
	    }

	    private static void showRemainingDenominations() {
	        System.out.println("Remaining denominations:");
	        atm.getAvailableDenominations().forEach(d -> System.out.print(d + " "));
	        System.out.println();
	    }

}
