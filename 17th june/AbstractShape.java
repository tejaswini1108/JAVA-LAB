import java.util.*;
abstract class Shape
{
public int x,y;
public abstract void area();
}
class Rectangle extends Shape
{
 public Rectangle(int x,int y)
{
this.x = x;
this.y = y;
System.out.print("Rectangle Area: ");
}
public void area()
{
System.out.println( x*y);
}
}
class Triangle extends Shape
{
 public Triangle(int x,int y)
{
this.x = x;
this.y = y;
System.out.print("Triangle Area: ");
}
public void area()
{
System.out.println( 0.5*x*y);
}
}
class Circle extends Shape
{
 public Circle(int x)
{
this.x = x;
System.out.print("Circle Area: ");

}
public void area()
{
System.out.println(  (22/7)*x*x);
}
}
class AbstractShape
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
int a,b;
a=sc.nextInt();
b= sc.nextInt();
Rectangle r = new Rectangle(a,b);
r.area();
Triangle t = new Triangle(a,b);
t.area();
Circle c = new Circle(a);
c.area();
}
}



