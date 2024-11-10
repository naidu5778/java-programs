import java.util.Scanner;
class Break
{
 public static void main(String args[])
 {
  Scanner naidu=new Scanner(System.in);
  int i=1;
System.out.println("enter numbers:");
i=naidu.nextInt();
for(i=1;i<=10;i++)
{
if(i==6)
{
break;
}
System.out.println(i);
}
}
}
