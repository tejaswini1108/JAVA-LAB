//Program to create a Thread by Extending from Thread Class
class A extends Thread
{
public void run()
{
System.out.println("This is from thread class");
}
}
class T3
{
public static void main(String args[])
{
A o = new A();
o.start();
System.out.println("Thread name:"+o.getName());
System.out.println("Main Thread:"+Thread.currentThread());
}
}
