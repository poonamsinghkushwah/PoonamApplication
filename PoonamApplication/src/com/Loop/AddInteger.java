package com.Loop;

public class AddInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num = new int[5];
		
		num[0]=20;
		num[1]=30;
		num[2]=10;
		num[3]=50;
		num[4]=40;
		int sum=0;
		
		for(int i=0; i<num.length; i++) {
			 sum=sum+num[i];
		}
             System.out.println(sum);
	}

}
