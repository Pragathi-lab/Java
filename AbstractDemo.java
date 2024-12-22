import java.util.*;
abstract class Shape{
int dim1;
int dim2;
abstract void printArea();
}
class Rectangle extends Shape
{
Rectangle(int a,int b)
{
dim1=a;
dim2=b;
}
void printArea()
{
System.out.println("The area of rectangle is :"+ dim1*dim2);
}
}
class Triangle extends Shape
{
Triangle(int a,int b)
{
dim1=a;
dim2=b;
}
void printArea()
{
System.out.println("The area of triangle is :"+ 0.5*dim1*dim2);
}
}
class Circle extends Shape
{
Circle(int a)
{
dim1=a;
}
void printArea()
{
System.out.println("The area of circle is :"+ 3.14*dim1*dim1);
}
}
class AreaOfShapes{
public static void main(String args[])
{
int l,b,base,height,radius;
Scanner sc=new Scanner(System.in);
System.out.println("Enter length of rectangle:");
l=sc.nextInt();
System.out.println("Enter breadth of rectangle:");
b=sc.nextInt();
System.out.println("Enter length of triange:");
base=sc.nextInt();
System.out.println("Enter height of triangle:");
height=sc.nextInt();
System.out.println("Enter radius of circle:");
radius=sc.nextInt();

Rectangle r=new Rectangle(l,b);
r.printArea();
Triangle t=new Triangle(base,height);
t.printArea();
Circle c=new Circle(radius);
c.printArea();
}
}
