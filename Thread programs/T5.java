class A extends Thread
{
public void run()
{
System.out.println("Thread 1:"+Thread.currentThread());
}
}
class B extends Thread
{
public void run()
{
System.out.println("Thread 2:"+Thread.currentThread());
}
}
class C extends Thread
{
public void run()
{
System.out.println("Thread 3:"+Thread.currentThread());
}
}
class T5
{
public static void main(String args[])
{
A o1 = new A();
B o2 = new B();
C o3 = new C();
o1.start();
o2.start();
o3.start();
}
}