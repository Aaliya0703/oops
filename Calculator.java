import java.util.*;

class Area{
  
    double area(double radius)
    {
       return  3.14*radius*radius;
    }
    double area(double length,double breadth)
    {
       return length*breadth;
    }
    double area(int side)
    {
        return side*side;
     }
     double area(float base,float height)
     {
        return 0.5*base*height;
     }
}

class Calculator{
   public static void main(String args[])
   {
      Scanner sc=new Scanner(System.in);
      Area ar=new Area();
      
      System.out.println("Enter radius:");
      double radius=sc.nextDouble();
      sc.nextLine();
      System.out.println("Area of circle:"+ar.area(radius));
      System.out.println("Enter length:");
      double length=sc.nextDouble();
      sc.nextLine();
      System.out.println("Enter breadth:");
      double breadth=sc.nextDouble();
      sc.nextLine();    
      System.out.println("Area of rectangle:"+ar.area(length,breadth));
      System.out.println("Enter side:");				
      int side=sc.nextInt();
      sc.nextLine();
      System.out.println("Area of square:"+ar.area(side));
      System.out.println("Enter base :");
      float base=sc.nextFloat();
      sc.nextLine();
      System.out.println("Enter height:");
      float height=sc.nextFloat();
      sc.nextLine();
      System.out.println("Area of triangle:"+ar.area(base,height));
}
}
      
      
        
  
