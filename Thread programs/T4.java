//4. creating a thread by implementing Runnable interface.
class A implements Runnable
{
public void run()
{
System.out.println("Thread id is "+Thread.currentThread().getId());
}
}
class T4
{
public static void main(String args[])
{
A o = new A();
Thread obj = new Thread(o);
obj.setName("Teja");
obj.start();
System.out.println("Thread name is "+obj.getName());
}
}

