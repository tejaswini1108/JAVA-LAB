import java.util.Scanner;
class Simpleint{
public static void main(String args[]){
int p,t,r;
float simp;
Scanner sc = new Scanner(System.in);
System.out.println("Enter the values:");
p = sc.nextInt();
t = sc.nextInt();
r = sc.nextInt();
simp = (p*t*r)/100;
System.out.println(" result :"+simp);
}
}
