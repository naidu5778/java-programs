import java.util.Scanner;
class Std
{
public static void main(String args[])
{
Scanner naidu=new Scanner(System.in);
int sno,m,p,c,total;
String sname;
float savg;
System.out.println("enter number:");
sno=naidu.nextInt();
System.out.println("enter maths marks:");
m=naidu.nextInt();
System.out.println("enter physics marks:");
p=naidu.nextInt();
System.out.println("enter chemistry marks:");
c=naidu.nextInt();
System.out.println("enter name:");
sname=naidu.next();
total=m+p+c;
savg=total/3;
System.out.println("number is:"+sno);
System.out.println("maths marks:"+m);
System.out.println("physics marks:"+p);
System.out.println("chemistry marks:"+c);
System.out.println("total is:"+total);
System.out.println("name is:"+sname);
System.out.println("average is:"+savg);
}
}


