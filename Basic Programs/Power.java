import java.util.Scanner;
class Power{
public static void main(String args[])
{
Double b,e,r;
Scanner s = new Scanner(System.in);
System.out.println("Enter the values:");
b = s.nextDouble();
e = s.nextDouble();
r = Math.pow(b,e);
System.out.println("result is"+r);
}
}