//Program to use get Name and get Priority
class T2{
public static void main(String args[])
{
Thread o = Thread.currentThread();
System.out.println("Name of thread:"+o.getName());
System.out.println("priority of thread:"+o.getPriority());
}
}
