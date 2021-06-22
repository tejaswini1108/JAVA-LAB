import java.util.Scanner;
class Vorc
{
public static void main(String args[])
{
char t;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the char:");
t = sc.next().charAt(0);
if(t == 'a'||t=='e'||t=='i'||t=='o'||t=='u')
{
System.out.println("Vowels");
}
else
{
System.out.println("Consonents");
}
}
}
