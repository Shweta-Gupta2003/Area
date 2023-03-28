import java.util.*;
class Circles
{
public static void main(String args[])
{
double r,area,perimeter;

Scanner sc=new Scanner(System.in);
System.out.println("Enter the radius of circle:");
r=sc.nextDouble();

area=3.14*r*r;
System.out.println("Area of a Circle:"+area);

perimeter=2*3.14*r;
System.out.println("Perimeter of a Circle:"+perimeter);

}
}