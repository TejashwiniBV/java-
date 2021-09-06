class Temple{

public static void main(String a[]){

String templeName[]=new String[5];
templeName[0]="Shri Ranganathaswamy Temple";
templeName[1]="Sri Kollur Mookambika Temple";
templeName[2]="ISKCON Temple";
templeName[3]="Sri Hasanamba Temple";
templeName[4]="Sri Chamundeshwari Temple";


String place[]=new String[5];
place[0]="Srirangapatna";
place[1]="Kollur";
place[2]="Bangalore";
place[3]="Hasan";
place[4]=" Mysore";


       for(int i=0;i<templeName.length;i++){
          System.out.println(templeName[i]);
       }
      
	   for(int j=0;j<place.length;j++){
          System.out.println(place[j]);
       }
}

}