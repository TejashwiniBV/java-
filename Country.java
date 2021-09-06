class Country{
	
	static String countryName[]  = {"India", " Sri Lanka" , "England" , "SouthAfrica" , "USA" , "Pakistan" , "China"};

    static int states[] = {29,22,11,10,23,14};
	  
	 static String capitals[] = {"New Delhi" , "Colombo" , "London" , "Cape Town" , "Washington" , " Islamabad" , "Beijing"}; 
   
    public static void main(String a[]){
   
    
      for(int i=0;i<countryName.length;i++){
          System.out.println(countryName[i]);
       }
       System.out.println("no of states");
	   for(int j=0;j<states.length;j++){
          System.out.println(states[j]);
       }
   
   }
}



