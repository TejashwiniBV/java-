import java.util.Scanner;
class Combination{

public static void main(String a[]){
	
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the n and r value");
	int n= sc.nextInt();
	int r= sc.nextInt();
	int nCr=comb(n)/(comb(r)*(comb(n-r)));
	System.out.println(" the ncr value is:"+nCr);

}

public static int comb(int n){

int fact=1;

for(int i=1;i<=n;i++)
{
  fact=fact*i;
} 
return fact;

}
}