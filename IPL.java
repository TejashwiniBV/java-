class IPL{
	
	static String teamNames[]  = {"RCB", "CSK" , "MI" , "KKR" , "RR" , "DC" , "SRH" ,"KXIP"};

    static int points[] = {10,10,8,4,6,12,2,6};
	  
	 static String captain[] = {"Virat Kohli" , "MS Dhoni" , "Rohit Sharma" , "Eoin Morgan" , "Sanju Samson" , " Rishabh Pant" , "Kane Williamson","KL Rahul"}; 
   
    public static void main(String a[]){
   
    
	 for(int i=0;i<teamNames.length;i++){
          System.out.println(teamNames[i]);
       }
       
	   for(int j=0;j<points.length;j++){
          System.out.println(points[j]);
       }
   
   }
}