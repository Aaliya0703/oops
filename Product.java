import java.util.*;
class item
{
  int pcode;
  String pname;
  float price;
  
  void getdata()
  {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter pcode,pname and price:");
   
     this.pcode=sc.nextInt();
     sc.nextLine();
     this.pname=sc.nextLine();
     this.price=sc.nextFloat();
    }
    void display()
    {
       System.out.println("product code:"+pcode);
       System.out.println("product name:"+pname);
       System.out.println("product price:"+price);
    }
 }
 
 class Product
 {
   public static void main(String args[])
   {
       
      item p1=new item();
      item p2=new item();
      item p3=new item();
      
      p1.getdata();
      p2.getdata();
      p3.getdata();
      p1.display();
      p2.display();
      p3.display();
      
      if(p1.price<p2.price && p1.price<p3.price)
      {
         System.out.println(p1.price+"is lowest");
      }
       else if(p2.price<p3.price)
      { 
         System.out.println(p2.price+"is lowest");
       }
       else
       {
         System.out.println(p3.price+" is lowest ");
        }
       
      
      }
}

