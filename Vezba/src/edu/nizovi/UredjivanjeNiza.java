package edu.nizovi;

import java.util.Random;

public class UredjivanjeNiza {
      public static void sort(int [] arrayName){
    	
    	  int temp;
    	    for (int i = 0; i < arrayName.length-1; i++)
    	    {
    	        if(arrayName[i] > arrayName[i+1])
    	        {
    	            temp=arrayName[i];
    	            arrayName[i]=arrayName[i+1];
    	            arrayName[i+1]=temp;
    	            i=-1;
    	        }
    	    }        
 	
      }
	public static void main(String[] args) {
		
		int [] arrayName = {8,22,45,1,3}; 
		Random rand =new Random();
	   for (int i = 0; i < arrayName.length; i++) { 
	      //arrayName[i] = (int)(Math.random()*100); 
	     // arrayName[i]=rand.nextInt();
	    } 

	    //System.out.println(sort(arrayName));
         
	  

}
}