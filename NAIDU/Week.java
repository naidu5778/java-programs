import java.util.Scanner;
class Week
{
public static void main(String args[])
{
Scanner naidu=new Scanner(System.in);
int n;
System.out.println("enter n vaule:");
n=naidu.nextInt();
if(n==1)
{
System.out.println("it is Sunday");
}
else if(n==2)
{
System.out.println("it is Monday");
}
else if(n==3)
{
System.out.println("it is Tuesday");
}
else if(n==4)
{
System.out.println("it is Wednesday");
}
else if(n==5)
{
System.out.println("it is Thursday");
}
else if(n==6)
{
System.out.println("it is Friday");
}
else if(n==7)
{
System.out.println("it is Saturday");
}
else
{
System.out.println("enter valid number");
}
}
}