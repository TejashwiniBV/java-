class Ncr{

public static void main(String a[]){
	
	int nCr=comb(4)/(comb(2)*(comb(4-2)));
	System.out.println(nCr);

}

public static int comb(int n){ll

int fact=1;

for(int i=1;i<=n;i++)
{
  fact=fact*i;
} 
return fact;

}
}