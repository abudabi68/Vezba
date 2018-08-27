package edu.nizovi;

public class UredjivanjeNizaMetodaUmetanja {

	public static void main(String[] args) {
		/*
		 * Uredjivanje niza gde se elemnti u nizu pojavlju od najmanjeg ka najvecim elementom
		 * ukoliko hocemo da nam prikazuje od najveceg ka najmanjem moramo da napisemo 
		 * if(a[j]<a[j+1])
		 */
		int a[]={22,48,2,8,18,42};
		
		
         for(int i=1;i<a.length;i++){
        	 for(int j=i-1;j>=0;j--){
        		 if(a[j]>a[j+1]){
        		 int b=a[j];
        		 a[j]=a[j+1];
        		 a[j+1]=b;
        		 }
        		
        	 }
	}
        
for(int i=0; i<a.length;i++){
	System.out.println(a[i]);
}
}
}
