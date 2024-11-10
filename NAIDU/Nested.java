import java.util.Scanner;
class Nested
{
 public static void main(String args[])
 {
  Scanner naidu=new Scanner(System.in);
  int i,j;
System.out.println("enter i value:");
i=naidu.nextInt();
System.out.println("enter j value:");
j=naidu.nextInt();
for(i=1;i<=5;i++)
{
for(j=1;j<=5;j++)
{
System.out.print("*");
}
System.out.println();
}
}
}
