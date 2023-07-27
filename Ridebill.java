package com.mono.ifelse;

import java.util.Scanner;

public class Ridebill {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc=new Scanner(System.in);
       System.out.println("enter the height");
       int height=sc.nextInt();
       if (height>120)
       {
    	   System.out.println("can ride");
    	   System.out.println("enter age");
    	   int age=sc.nextInt();
    	   int sum=0;
    	   if(age<12)
    	   {
    		 int x=sum+5;
    		 System.out.println("if want photos?");
    		 String s=sc.next();
    		 if(s.equals("yes"))
    		 {
    			int y=x+3;
    			System.out.println("The total bill is "+y);
    		 }
    		 else
    		 {
    			 System.out.println("The total bill is "+x);
    		 }
    	   }
    	   else if (age>=12 && age<=18)
    	   {
    		   
    		  int x1=sum+7;
     		 System.out.println("if want photos?");
     		 String s=sc.next();
     		 if(s.equals("yes"))
     		 {
     			int y=x1+3;
     			System.out.println("The total bill is "+y);
     		 }
     		 else
     		 {
     			 System.out.println("The total bill is "+x1);
     		 }
    	   }
    	   else if (age>18)
    	   {
    		   int x2=sum+12; 
      		 System.out.println("if want photos?");
      		 String s=sc.next();
      		 if(s.equals("yes"))
      		 {
      			int y2=x2+3;
      			System.out.println("The total bill is "+y2);
      		 }
      		 else
      		 {
      			 System.out.println("The total bill is "+x2);
      		 }
    		   
    	   }
    	   else if(age>=45 && age<=55)
    	   {
    		   int y=sum+0; 
      		 System.out.println("if want photos?");
      		 String s=sc.next();
      		 if(s.equals("yes"))
      		 {
      			int x=sum+3;
      			System.out.println("The total bill is "+x);
      		 }
      		 else
      		 {
      			 System.out.println("The total bill is $:"+y);
      		 }
    		   
    	   }
       }
       else
       {
    	   System.out.println("can't ride");
       }
	}

}
