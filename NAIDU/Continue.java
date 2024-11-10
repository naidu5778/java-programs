import java.util.Scanner;
class Continue
{
 public static void main(String args[])
 {
  Scanner naidu=new Scanner(System.in);
  int i=6;
System.out.println("enter numbers:");
i=naidu.nextInt();
for(i=1;i<=10;i++)
{
if(i==6)
{
continue;
}
System.out.println(i);
}
}
}
