package edu.nizovi;

import java.util.Scanner;

public class FuzijaElemenata {

	public static void main(String[] args) {
		/*
		 * Fuzija elemnata je klasa obalja sledece radnje 
		 * Napisemo prvo koliko elemenata unosimo u niz 
		 * unesemo i zatim unesemo za niz a i za niz b elemente 
		 * kao rezultat dobijamo niz c koji sadrzi elemente niza a i b 
		 */
		Scanner citaj=new Scanner(System.in);
		while(true){
			System.out.println("na:");
			int na=citaj.nextInt();
		    if(na<0) break;
		    int a[]=new int[na];
		    System.out.println("A?");
		    for(int i=0;i<na;a[i++]=citaj.nextInt());
		    if(na==0)System.out.println("Null");
		    System.out.println("nb:");
			int nb=citaj.nextInt();
		    if(nb<0) break;
		    int b[]=new int[nb];
		    System.out.println("B?");
		    for(int i=0;i<nb;b[i++]=citaj.nextInt());
		    if(nb==0)System.out.println("Null");
		    int nc=na+nb;
		    int[]c=new int[nc];
		    int ia=0,ib=0,ic=0;
		    while(ia<na && ib<nb){
		    	c[ic++]=(a[ia]<b[ib]) ? a[ia++] :b[ib++];
		    }
		    while(ia<na) c[ic++]=a[ia++];
		    while(ib<nb) c[ic++]=b[ib++];
		    System.out.println("C");
		    for(int i=0;i<nc;System.out.println(c[i++]+""));
		} 
		
		int a[]={1,45,78,62,54,22};
		int b[]={2,55,12,11,14,8};
		int c[]={};
		int ia=0;
		int ib=0;
		int ic=0;
		
		while(ia<c.length)c[ic++]=a[ia++];
		while(ib<c.length)c[ic++]=b[ib++];
		System.out.println("C niz ima elementi :");
		for(int i=0;i<c.length;System.out.println(c[i++]));
		
		
	}

}
