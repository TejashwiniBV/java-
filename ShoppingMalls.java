class ShoppingMalls{

public static void main(String a[]){

String mallName[]=new String[5];
mallName[0]="Orion";
mallName[1]="Mantri";
mallName[2]="Garuda";
mallName[3]="central";
mallName[4]="ommercial Space";

double rating[]=new double[5];
rating[0]=4.8;
rating[1]=4.5;
rating[2]=4.6;
rating[3]=4.9;
rating[4]=5.0;

      for(int i=0;i<mallName.length;i++){
          System.out.println(mallName[i]);
       }
      
	   for(int j=0;j<rating.length;j++){
          System.out.println(rating[j]);
       }
}


}