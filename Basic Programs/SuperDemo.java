class A{
int i;
A(int i)
{
this.i=i;
}
}
class B extends A{
int var;
B(int a,int b)
{
super(a);
var = b;
}
void print()
{
System.out.println("sub class "+var);
System.out.println("super class "+super.i);

}
}
class SuperDemo{
public static void main(String[] args)
{
B o = new B(5,6);
o.print();
}
}