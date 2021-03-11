import java.util.*;
import java.lang.*;
abstract class shape
{
	int x;
	int y;
	shape(){}
	abstract void printarea();
}
class circle extends shape
{
	double pi=3.14;
	circle(int r,int s)
	{x=r;
	s=y;}	
	void printarea()
	{
	double a;
	a=pi*x*x;
	System.out.println("area of circle is"+a);
	}
}
class triangle extends shape
{
	triangle(int b,int h)
	{
	x=b;
	y=h;
	}
	void printarea()
	{
	double a2;
	a2=0.5*x*y;
	System.out.println("area of triangle is"+a2);
	}
}
class rectangle extends shape
{
	rectangle(int l,int b)
	{
	x=l;
	y=b;
	}
	void printarea()
	{
	int a3;
	a3=x*y;
	System.out.println("area of rectangle is"+a3);
	}
}
class area 
{
	public static void main(String args[])
	{
	circle c1=new circle(2,0);
	c1.printarea();
	triangle t1=new triangle(2,4);
	t1.printarea();
	rectangle r1=new rectangle(6,8);
	r1.printarea();
	}
}
	