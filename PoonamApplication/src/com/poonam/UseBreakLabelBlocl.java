package com.poonam;

public class UseBreakLabelBlocl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int i=10;
         l1:
         {
        	 System.out.println("Hello");
        	 if(i==10) { break l1;
        		
        	 }
        	 System.out.println("Hii");
         }
         System.out.println("poonam");
	}

}
