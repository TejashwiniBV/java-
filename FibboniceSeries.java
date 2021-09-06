class Combination{

public static void main(String a[]){

comb(4,3);

}

public static void comb(int n, int r){

int fact=1;
for(int i=1;i<=n;i++)
{
  for (int j=1;j<=r;j++)
  {
      fact=(fact*i)/((fact*(i-j))*(fact*j));
  }	  
} 

System.out.println(fact);

}
}