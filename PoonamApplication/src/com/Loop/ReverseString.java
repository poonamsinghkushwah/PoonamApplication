package com.Loop;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}
       public void rev() {
    	   String	str = "poonam";
    	   String s="";
    	   
    	   for(int i=str.length()-1;i>=0;i--) {
    		   s=s+str.charAt(i);
    	   }
    	   System.out.println(s);
}
}
