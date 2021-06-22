//1. Program main thread and currentThread() method
class T1{
public static void main(String args[])
{
Thread o = Thread.currentThread();
System.out.println("current thread :"+o);
}
}