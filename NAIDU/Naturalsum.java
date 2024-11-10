import java.util.Scanner;
class Factorial
{
public static void main(String args[])
{
Scanner naidu=new Scanner(System.in);
int i=1,n,sum=1;
System.out.println("enter factorial number:");
n=naidu.nextInt();
while(i<=n)
{
fact=fact*i;
i++;
}
System.out.println(fact);
}
}
