class Thread_demo extends Thread
{
public void run()
{
System.out.println("Thread"+Thread.currentThread());
}
}
class Td
{
public static void main(String args[])
{
 Thread_demo obj = new Thread_demo();
 obj.start();
}
}