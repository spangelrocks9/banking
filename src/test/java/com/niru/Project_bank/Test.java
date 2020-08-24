package com.niru.Project_bank;

import java.util.Scanner;

public class Test {
	
	public static void main(String[] args) {
		
		bank obj1=new bank("niru","1");
		obj1.showMenu();
	}
	

}

class bank
{
	int balance;
	int previousTransaction;
	String customerName;
	String customerId;
	
	bank(String cname, String cid)
	{
		customerName=cname;
		customerId=cid;
	}
	
	
	void deposit_amount(int amount)
	{
		if(amount!=0)
		{
			balance=balance+amount;
			previousTransaction=amount;
		}
	}
	
	void withdraw_amount(int amount)
	{
		if(amount!=0)
		{
			balance=balance-amount;
			previousTransaction=amount;
		}
	}
	
	void getPreviousTransaction()
	{
		if(previousTransaction>0)
		{
			System.out.println("Deposited:" +previousTransaction);
		}
		
		else if(previousTransaction<0)
		{
			System.out.println("Withdrawn:" +Math.abs(previousTransaction));
		}
		else
		{
			System.out.println("No transaction");
		}
		
	}
	
	void showMenu()
	{
		char option='\0';
		Scanner scanner= new Scanner(System.in);
		System.out.println("Welcome"+ customerName);
		System.out.println("Your Id is"+ customerId);
		System.out.println("\n");
		System.out.println("1.Deposit");
		System.out.println("2.Withdraw");
		System.out.println("3.Check Balance");
		System.out.println("4.Exit");
		
		do {
			
			System.out.println("*********************");
			System.out.println("Enter An Option");
			System.out.println("********************");
			option=scanner.next().charAt(0);
			System.out.println("\n");
			
			
			switch(option)
			{
			case '1':
				System.out.println("*********************");
				System.out.println("Enter An Amount To Deposit");
				System.out.println("********************");
				int amount=scanner.nextInt();
				deposit_amount(amount);
				System.out.println("\n");
				break;
				
				
			case '2':
				System.out.println("*********************");
				System.out.println("Enter An Amount To withdraw");
				System.out.println("********************");
				int amount2=scanner.nextInt();
				withdraw_amount(amount2);
				System.out.println("\n");
				break;
				
				
			case '3':
				System.out.println("*********************");
				System.out.println("Balance="+balance);
				System.out.println("********************");
				System.out.println("\n");
				break;
				
				
			default:
				System.out.println("Invalid Option");
				break;
			}
				
			}while(option !='4');
			System.out.println("Thankyou!");
			
			
		}
		
	}



	
