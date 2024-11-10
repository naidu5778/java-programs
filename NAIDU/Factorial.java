import java.util.Scanner;
class Factorial
{
 public static void main(String args[])
 {
  Scanner naidu=new Scanner(System.in);
  int i=1,n,mult=1;
System.out.println("enter factorial number:");
n=naidu.nextInt();
do
{
System.out.println("mult");
i++;
}
while(i<=n)
{
mult=mult*i;
i++;
}
 }
}