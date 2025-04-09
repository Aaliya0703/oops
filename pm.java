import java.util.*;
class Multiple extends Thread{

     public void run(){
       System.out.println("Multiplication table of 5");
       for(int i=1;i<=10;i++)
       {
         System.out.println("5*"+i+"="+ 5*i);
       }
 }
 }
 class Prime extends Thread{
    public void run(){
    int i,j;
    
    for(j=2;j<20;j++)
    {
    int flag=0;
    
    for(i=2;i<=j/2;i++)
    {
      if(j%i==0){
      flag=1;
      break;
      
      }
    }
    
    
    if(flag==0){
    System.out.println("Prime numbers:"+j);
   }
   }
   }
   }



    
 class pm{
 public static void main(String args[]){
 Multiple m=new Multiple();
 Prime p=new Prime();
 
 m.start();
 p.start();
 }
 }
        
