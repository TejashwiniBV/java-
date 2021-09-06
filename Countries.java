class Countries{
	
   
	

    static int states[] = {29,22,11,10,23,14};
	  
	 
    public static void main(String a[]){
		
    String countryName[]  = new String[7];
	countryName[0]= "India";
	countryName[1]= "Sri Lanka";
	countryName[2]= "England";
	countryName[3]= "SouthAfrica";
	countryName[4]= "USA";
	countryName[5]=  "Pakistan";
	countryName[6]="China";
   
       for(int i=0;i<countryName.length;i++){
          System.out.println(countryName[i]);
       }
       System.out.println("no of states");
	   for(int j=0;j<states.length;j++){
          System.out.println(states[j]);
       }
       	   

   
   }
}
