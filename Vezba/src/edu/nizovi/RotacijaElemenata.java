package edu.nizovi;

import java.util.Scanner;

public class RotacijaElemenata {

	public static void main(String[] args) {
		
			/*Scanner Citaj=new Scanner(System.in);
			int n=Citaj.nextInt();
			if(n<=0) break;
			double [] a= new double[n];
			System.out.println("A:");
			for (int i=0;i<n;a[i++]=Citaj.nextDouble());
        
        */
		/*
		 * Rotiranje elemenata u nizu onaj koji je bio na prvom nakon rotacije je na poslednjem
		 */
		double a[]={1,5,96,13,24,28,21,11};
		double n= a.length;
       
		for (int i=0, j=(int) (n-1);i<j;i++,j--){
        	double b;
        	b=a[i];
        	a[i]=a[j];
        	a[j]=  b;
        }
        for (int i=0;i<n;System.out.println(""+a[i++]));
        
	
	}
}
