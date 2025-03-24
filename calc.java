import java.util.*;

interface Shape
{
    public double perimeter();
    public double area();
 }
 
 class Rectangle implements Shape
 {
    double length;
    double width;
     Rectangle(double length,double width)
    {
        this.length=length;
        this.width=width;
    }
    public double area()
    {
       return length*width;
     }
     public double perimeter()
     {
        return 2*(length+width);
     }
 }
 
 class Circle implements Shape
 {
     double radius;
    Circle(double radius)
    {
       this.radius=radius;
     }
     public double area()
     {
         return 3.14*radius*radius;
      }
      public double perimeter()
      {
         return 2*3.14*radius;
      }
}

class calc
{
  public static void main(String args[])
  {
     Scanner sc=new Scanner(System.in);
     
     
     
     while(true)
     {
        System.out.println("Menu");
        System.out.println("1.Area and Perimeter of Rectangle");
        System.out.println("2.Area and Perimeter of circle");
        System.out.println("3.Exiting.....");
        System.out.println("Enter your choice:");
        int choice=sc.nextInt();
        sc.nextLine();
        switch(choice)
        {
            case 1:
                         System.out.println("Enter length of rectangle=");
                         double length=sc.nextDouble();
                         sc.nextLine();
                         System.out.println("Enter width of rectangle=");
                         double width=sc.nextDouble(); 
	               sc.nextLine();
	               Rectangle rect=new Rectangle(length,width);
	               System.out.println("Area of rectangle="+rect.area());
	               System.out.println("Perimeter of rectangle="+rect.perimeter());
	               break;
	  case 2:
	               System.out.println("Enter radius of  circle=");
	               double radius=sc.nextDouble();
	               sc.nextLine();
	               Circle cr=new Circle(radius);
	               System.out.println("Area of circle="+cr.area());
	               System.out.println("Perimeter of circle="+cr.perimeter());
	               break;
	  case 3:
	              System.out.println("Exiting......");
	              break;
	  default:
	               System.out.println("Invalid choice!");
      }
   }
 }
} 
            
                          
         
