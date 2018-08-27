package edu.vezba;

import java.util.Scanner;

public class Vezbanje {

	public static void main(String[] args) {
		while(true){
		Scanner tastatura=new Scanner(System.in);	
		int n=tastatura.nextInt();	
		if(n<= 0)break;	
			float s1=0;
			for(int i=1; i<=n;i++){
				s1 += 1./i/i;
			}
			float s2=0;
			for(int i=n; i>=1;i--){
			s2+=1./i/i;
			
			}
			System.out.println(n+ "\t" +s1 + "\t" +s2);
			
			
		}
	}

}
