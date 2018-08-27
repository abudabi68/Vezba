package edu.vezba;

import java.util.Scanner;

public class Nizovi {

	public static void main(String[] args) {
		/*
		 * Program koji pokazuje koji elemnti u nizu su deljivi sa 3
		 */
		Scanner Citaj=new Scanner(System.in);
         while(true){
       System.out.println("N");
       int n=Citaj.nextInt();
       if(n<0) break;
       int [] a=new int [n];
       System.out.println("A");
       for (int i=0;i<n;i++)a[i]=Citaj.nextInt();
       
       int k=0;
       double s=0;
       for(int i=0;i<n;i++){
    	   if(a[i]%3==0){
    		  s +=a[i];
    		  k++;    		   
    	   }
    	   if(k !=0){
    		   s=s/k;
    		   System.out.println(s);
    	   }
       } 
         }
}
}