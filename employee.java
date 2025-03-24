import java.util.*;

class Employee
{
   int eNo;
   String eName;
   float eSalary;
   Employee(int eNo,String eName,float eSalary)
  {
   this.eNo=eNo;
   this.eName=eName;
   this.eSalary=eSalary;
   }
   void display()
   {
     System.out.println("Employee id:"+eNo);
     System.out.println("Employee name:"+eName);
     System.out.println("Employee salary:"+eSalary);
    }
}
class employee
{
  public static void main(String args[])
  {

  int i;
  Scanner sc=new Scanner(System.in);
  System.out.println("enter number of employees:");
  int n=sc.nextInt();
  sc.nextLine();
  Employee[] employees=new Employee[n];
  for(i=0;i<n;i++)
  {
  System.out.println("enter"+(i+1)+"employee:");
  System.out.println("enter employee id:");
  int eNo=sc.nextInt();
  sc.nextLine();
  System.out.println("enter employee name:");
  String eName=sc.nextLine();
  System.out.println("salay:");
  float eSalary=sc.nextFloat();
  sc.nextLine();
  
  employees[i]=new Employee(eNo,eName,eSalary);
  }
  System.out.println("Enter employee id to search:");
  int search=sc.nextInt();
  sc.nextLine();
  boolean found=false;
  for(Employee emp:employees)
  {
    if(emp.eNo == search)
    {
       System.out.println("Employee with employee id"+emp.eNo+"found");
       emp.display();
       found=true;
       break;
   }

  if(!found)
  {
    System.out.println("Not found");
   }
}
}
 } 
   
