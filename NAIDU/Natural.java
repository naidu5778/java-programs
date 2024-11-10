import java.util.Scanner;
class Naturalsum
{
public static void main(String args[])
{
Scanner naidu=new Scanner(System.in);
int i=1,n,sum=0;
System.out.println("enter the n natural number:");
n=naidu.nextInt();
while(i<=n)
{
sum=sum+i;
i++;
}
System.out.println(sum);
i++;
}
}
