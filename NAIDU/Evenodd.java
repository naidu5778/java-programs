import java.util.Scanner;
class Evenodd
{
public static void main(String args[])
{
Scanner naidu=new Scanner(System.in);
int n;
System.out.println("enter value n");
n=naidu.nextInt();
System.out.println("number is:"+n);
if(n % 2 == 0)
{
System.out.println("even");
}
else
{
System.out.println("odd");
}
}
}