class AirPort{

public static void main(String a[]){

String airPortName[]=new String[5];
airPortName[0]="Kempegowda International Airport";
airPortName[1]="Mangalore International Airport";
airPortName[2]="Visakhapatnam Airport";
airPortName[3]="Chennai International Airport";
airPortName[4]="Coimbatore International Airport";


String city[]=new String[5];
city[0]="Bengaluru";
city[1]="Mangalore";
city[2]="Visakhapatnam";
city[3]="Chennai";
city[4]="Coimbatore";


       for(int i=0;i<airPortName.length;i++){
          System.out.println(airPortName[i]);
       }
      
	   for(int j=0;j<city.length;j++){
          System.out.println(city[j]);
       }
}

}