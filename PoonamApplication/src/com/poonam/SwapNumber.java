package com.poonam;

public class SwapNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int a = 10;
      int b = 20;
                    
     System.out.println("a is "+ a + " and "+ b);
     a=a+b;//10+20=30
     b=a-b;//30-20=10
     a=b-a;//10-30=-20
     
     System.out.println("After swpping.. a is "+a+" and b is "+b);
	}

}
