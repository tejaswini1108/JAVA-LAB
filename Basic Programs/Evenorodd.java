import java.util.Scanner;
class Evenorodd{
public static void main(String args[])
{
int a;
System.out.println("enter number: ");
Scanner ip=new Scanner(System.in);
a = ip.nextInt();
if(a%2==0)
{
System.out.println("num is even:"+a);
}
else
{
System.out.println("num is odd:"+a);
}
}
}