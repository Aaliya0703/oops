import java.util.*;

class Person
{
    String name,gender,address;
    int age;
    Person(String name,String gender,String address,int age)
    {
        this.name=name;
        this.gender=gender;
        this.address=address;
        this.age=age;
     }
 }
 class Employee extends Person
 {
     int empId;
     String companyName,qualification;
     float salary;
     Employee(String name,String gender,String address,int age,int empId,String companyName,
                        String qualification,float salary)
                        {
                             super(name,gender,address,age);
                             this.empId=empId;
                             this.companyName=companyName;
                             this.qualification=qualification;
                         }
                         
}
class Teacher extends Employee
{
    String subject,department;
    int tcrId;
    Teacher(String name,String gender,String address,int age,int empId,String companyName,String qualification,float salary,String subject,String department,int tcrId)
                     {
                           super(name,gender,address,age,empId,companyName,qualification,salary);
                           this.subject=subject;
                           this.department=department;
                           this.tcrId=tcrId;
                       }
      void display()
      {
          System.out.println("Name:"+name);
          System.out.println("Gender:"+gender);
          System.out.println("Address:"+address);
          System.out.println("Age:"+age);
          System.out.println("Emloyee ID:"+empId);
          System.out.println("Company Name:"+companyName);
          System.out.println("Qualification:"+qualification);
          System.out.println("Salary:"+salary);
          System.out.println("Subject:"+subject);
          System.out.println("Department:"+department);
          System.out.println("Teacher Id:"+tcrId);
       }
}
class TcrDetails
{
     public static void main(String args[])
     {
         int n,i;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of teachers:");
        n=sc.nextInt();
        sc.nextLine();
        Teacher[] teachers=new Teacher[4];
        for(i=0;i<n;i++)
        {
              System.out.println("Enter name:");
              String name=sc.nextLine();
              System.out.println("Enter  gender:");
              String gender=sc.nextLine();
              System.out.println("Enter address:");
              String address=sc.nextLine();
              System.out.println("Enter age:");
              int age=sc.nextInt();
              sc.nextLine();
              System.out.println("Enter employee id:");
              int empId=sc.nextInt();
              sc.nextLine();
              System.out.println("Enter company name:");
              String companyName=sc.nextLine();
              System.out.println("Enter qualification:");
              String qualification=sc.nextLine();
              System.out.println("Enter salary:");
              float salary=sc.nextInt();
              sc.nextLine();
              System.out.println("Enter teacher id:");
              int tcrId=sc.nextInt();
              sc.nextLine();
              System.out.println("Enter subject:");
              String subject=sc.nextLine();
              System.out.println("Enter department name:");
              String department=sc.nextLine();
              
            teachers[i]=new Teacher(name,gender,address,age,empId,companyName,qualification,salary,subject,department,tcrId);
         }
         for(i=0;i<n;i++)
         {
             System.out.println("______Teacher Details______");
             teachers[i].display();
          }
      }
}
         
             
             

     
