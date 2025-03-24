import java.util.*;

class strinarr
{
   public static void main(String  args[])
   {
      Scanner sc=new Scanner(System.in);
      String s1,s2,s3,s4;
      
      
      System.out.println("string 1:");
      s1=sc.nextLine();    
     System.out.println("string 2:");
      s2=sc.nextLine(); 
      s3=s1;
      s4=s1+" "+s2;
         System.out.println("concatenated string:"+s4);
         System.out.println("length of string 1:"+s1.length());
         System.out.println("length of string 2:"+s2.length());
         System.out.println("original string :"+s1);
         System.out.println("copied string :"+s3);
         System.out.println("comparing two strings");
           if(s1.equals(s2))
                System.out.println("strings are equal");
          else  
                System.out.println("strings are not equal");
     
         
      }
    }
