import java.util.*;
class Authentication extends Exception{

   public Authentication(String message){
   super(message);
   }
}
class UserAuthentication{
public static void authenticate(String username,String password)  throws Authentication{
 
   
    String validUser="username";
    String validPass="pass@pass";
   
    
    if(username.isEmpty() || password.isEmpty())
    {
    throw new Authentication("username or password is empty.Please enter username/password");
    }
    if(username.length()<6)
    {
    throw new Authentication("Username requires atleast 6 characters!");
    }
    if(password.length()<8)
    {
    throw new Authentication("Password requires atleast 8 characters");
    }
   
    if(!username.equals(validUser) || !password.equals(validPass))
    {
      throw new Authentication("invalid username or password");
    }
    else
    {
     System.out.println("login successfully");
    }
}

 
public static void main(String args[]){
 
Scanner sc=new Scanner(System.in);
System.out.println("Enter Username:");
String username=sc.nextLine();
System.out.println("Enter password:");
String password=sc.nextLine();
    try{
    authenticate(username,password);
    }
    catch(Authentication a){
    System.out.println("Authentication failed"+a.getMessage());
    }
  }
}
     
  
