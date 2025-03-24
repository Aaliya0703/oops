import java.util.*;

class array
{
    public static void main(String args[])
    {
       int n,i;
       Scanner sc=new Scanner(System.in);
       System.out.println("enter number of strings:");
       n=sc.nextInt();
       sc.nextLine();
       String[]  strArray=new String[n];
       System.out.println("enter"+n+"strings:");
       for(i=0;i<n;i++)
       {
          System.out.println("enter string"+(i+1)+":");
          strArray[i]=sc.nextLine();
       }
       while(true)
       {
           System.out.println("MENU:");
           System.out.println("1.Search");
           System.out.println("2.Sort");  
           System.out.println("3.exit");
           System.out.println("enter your choice:");
           int choice=sc.nextInt();
           sc.nextLine();
           switch(choice)
           {
              case 1:
                   System.out.println("Enter string to search:");
                   String  search=sc.nextLine();
                   searchString(strArray,search);
                   break;
              case 2:
                    sortArray(strArray );
                    System.out.println("Sorted array:"+Arrays.toString(strArray));
                    break;
              case 3:
                   System.out.println("Exiting....");
                   return;
              default:
                  System.out.println("Invalid choice!");
                  }
          }
 }
 public static void searchString(String[] array,String search)
 {
    boolean found=false;
    System.out.println(search);
    for(String str: array)
    {
        if(str.equalsIgnoreCase(search))
        {
           found=true;
           break;
         }
     }
     if(found)
     {
        System.out.println("String "+search+"found in the array");
     }
     else
     {
        System.out.println("String"+search +"not found in the array");
     }
}
     
     public static void sortArray(String[] array)
     {
         Arrays.sort(array);
     }
}
            
              
