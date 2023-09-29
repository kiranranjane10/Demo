package com.cjc.bms.serviceImpl;

import java.util.Scanner;

import com.cjc.bms.model.Account;
import com.cjc.bms.service.Rbi;

public class Sbi implements Rbi
{
	Scanner sc=new Scanner(System.in);
	
	Account ac=new Account();
	
	double balance;
	@Override
	public void createAccount() 
	{
		System.out.println("Enter Account number: ");
		ac.setAcno(sc.nextInt());
		
		System.out.println("Enter Name: ");
		ac.setName(sc.next());
		
		System.out.println("Enter mobile number: ");
		ac.setMobno(sc.nextLong());
		
		System.out.println("Enter Adhar no: ");
		ac.setAdharno(sc.nextLong());
		
		System.out.println("Enter Gender: ");
		ac.setGender(sc.next());
		
		System.out.println("Enter age: ");
		ac.setAge(sc.nextByte());
		
		System.out.println("Enter balance: ");
		ac.setBalance(sc.nextDouble());
		
		System.out.println("Your data has been saved");
	}
	
	@Override
	public void displayDetails()
	{
		System.out.println("Account number: "+ac.getAcno());
		System.out.println("Name: "+ac.getName());
		System.out.println("Mobile number: "+ac.getMobno());
		System.out.println("Adhar number: "+ac.getAdharno());
		System.out.println("Gender: "+ac.getGender());
		System.out.println("Age: "+ac.getAge());	
		System.out.println("Balance: "+ac.getBalance());	
	}

	@Override
	public void depositMoney()
	{
		System.out.println("Enter amount to be debited:");
		double a=sc.nextDouble();
		balance=ac.getBalance()+a;
		ac.setBalance(balance);
		System.out.println(ac.getBalance());
		System.out.println("Your money has been debited");
		
	}

	@Override
	public void withdrawMoney()
	{
		System.out.println("Enter amount to be withdrawl:");
		double a=sc.nextDouble();
		balance=ac.getBalance()-a;
		ac.setBalance(balance);
		System.out.println(ac.getBalance());
		System.out.println("Your money has been credited");
		
	}

	@Override
	public void balanceCheck() 
	{
		System.out.println("Balance is: "+ac.getBalance());
	}

	
}
