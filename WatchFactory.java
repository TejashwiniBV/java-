class WatchFactory{

public static void main(String a[]){

String brandName[]=new String[5];
brandName[0]="Titan";
brandName[1]="Fastrack";
brandName[2]="HMT";
brandName[3]="MI";
brandName[4]="Dressberry";

int cost[]=new int[5];
cost[0]=2000;
cost[1]=2500;
cost[2]=1000;
cost[3]=1500;
cost[4]=1250;

       for(int i=0;i<brandName.length;i++){
          System.out.println(brandName[i]);
       }
      
	   for(int j=0;j<cost.length;j++){
          System.out.println(cost[j]);
       }
}


}