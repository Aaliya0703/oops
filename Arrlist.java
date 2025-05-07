import java.util.*;

class Arrlist{
 public static void main(String args[]){
 
   ArrayList<String> names=new ArrayList<>();
   Scanner sc=new Scanner(System.in);
   names.add("Krishna");
   names.add("Job");
   names.add("Abhi");
   
   
   System.out.println("Original list:"+ names);
   //System.out.println("size of list:"+Collectons.length());
   
   System.out.println("enter a position:");
   int pos=sc.nextInt();
   System.out.println("name at"+pos+":"+names.get(1));
   names.set(1,"sara");
   System.out.println("changed name at position '1' as 'sara':"+names);
   Collections.sort(names);
    System.out.println("sorted list:"+names);
   System.out.println("Enter a name to search:");
   String search=sc.nextLine();
   if(names.contains(search)){
   System.out.println(search+"found");
   }
   else 
   {
    System.out.println("not found");
    }
  
    
    
    names.remove("Krishna");
    System.out.println("list after removing 'krishna'"+names);
   
 }
 }
   
