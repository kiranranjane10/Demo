package com.cjc.bms.client;

import java.util.Scanner;

import com.cjc.bms.service.Rbi;
import com.cjc.bms.serviceImpl.Sbi;

public class Test
{
	public static void main(String[] args)
	{
		Rbi r=new Sbi();
		
		Scanner sc=new Scanner(System.in);
		
		
		while(true)
		{	
			System.out.println("***** Choose the option*****\n"+
					"1.createAccount\n"+
					"2.displayAllDetails\n"+
					"3.depositMoney\n"+
					"4.withdrawlMoney\n"+
					"5.balanceCheck\n"+
					"6.Exit");
			
			int ch=sc.nextInt();
		
		if(ch==1)
		{
			r.createAccount();
		}
		else if(ch==2)
		{
			r.displayDetails();
		}
		else if(ch==3)
		{
			r.depositMoney();
		}
		else if(ch==4)
		{
			r.withdrawMoney();
		}
		else if(ch==5)
		{
			r.balanceCheck();
		}
		else if(ch==6)
		{
			break;
		}
		else if(ch==7)
		{
			System.out.println("Wrong choice selected");
		}
	}
		
	}
}
