class Factorial1{

public static void main(String a[]){


myFact(4);

}


public static int myFact(int num){

int fact=1;
for(int i=1;i<=num;i++)
{
   fact=fact*i;
}

return fact;
}

}