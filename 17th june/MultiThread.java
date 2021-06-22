import java.util.*;
class Even extends Thread
{
public int x;
public Even(int x)
{
this.x = x;
}
public void run()
{
System.out.println("Even number "+x+" Square of num is "+x*x);
}
} 
class Odd extends Thread
{
public int x;
public Odd(int x)
{
this.x = x;
}
public void run()
{
System.out.println("Odd number "+x+" Cube of num is "+x*x*x);
}
} 
class A extends Thread
{
public void run()
{
int n=0;
Random r = new Random();
try{
for(int i=0;i<5;i++)
{
n = r.nextInt(50);
if(n%2==0)
{
Even e = new Even(n);
e.start();
}
else if(n%2!=0)
{
Odd o = new Odd(n);
o.start();
}
Thread.sleep(4000);
System.out.println("============================");
}
}
catch(Exception e)
{
System.out.println(e.getMessage());
}
}
}
public class MultiThread{
public static void main(String[] args)
{
A a = new A();
a.start();
}
}


